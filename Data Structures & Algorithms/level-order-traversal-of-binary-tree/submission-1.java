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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList <List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
                
        while(!q.isEmpty()){
            int s = q.size();
            ArrayList <Integer> t = new ArrayList<>();
            for(int i = 0 ; i < s;i++){
                TreeNode n = q.poll();
                t.add(n.val);
                if (n.left != null) q.offer(n.left);
                if (n.right != null) q.offer(n.right);
            }
            ans.add(t);
        }
        return ans;










       /* List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;        

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();   
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add(level);
        }
        
        return result;*/
    }
}