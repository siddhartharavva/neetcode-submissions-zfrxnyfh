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
    public int count =0;
    public void sH(TreeNode root,int max){
        if (root == null) return;
        if(root.val>=max)count++;
        max = Math.max(max,root.val);
        sH(root.left,max);
        sH(root.right,max);
    }
    public int goodNodes(TreeNode root) {   
        sH(root,Integer.MIN_VALUE);
        return count;

    }
}
