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
    boolean f = true;
    public int bH (TreeNode root){
        if(root==null)return 0;
        int  l = bH(root.left);
        int r = bH(root.right);
        if(Math.abs(l-r)>1)f = false;
        return 1+Math.max(l,r);

    }
    public boolean isBalanced(TreeNode root) {
        bH(root);
        return f;
    }
}
