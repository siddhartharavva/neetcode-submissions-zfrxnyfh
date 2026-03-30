/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {
    
    
    public String serialize(TreeNode root) {
    if (root == null) return "";
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    StringBuilder sb = new StringBuilder();
    while (!q.isEmpty()) {
        TreeNode node = q.poll();
        if (node == null) {
            sb.append("n,");
            continue;
        }
        sb.append(node.val).append(",");
        q.offer(node.left);
        q.offer(node.right);
    }
    return sb.toString();
}

    public TreeNode deserialize(String data) {
    if (data.isEmpty()) return null;

    String[] arr = data.split(",");

    TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int i = 1;

    while (!q.isEmpty()) {
        TreeNode node = q.poll();

        if (!arr[i].equals("n")) {
            node.left = new TreeNode(Integer.parseInt(arr[i]));
            q.offer(node.left);
        }
        i++;

        if (!arr[i].equals("n")) {
            node.right = new TreeNode(Integer.parseInt(arr[i]));
            q.offer(node.right);
        }
        i++;
    }

    return root;
}
}