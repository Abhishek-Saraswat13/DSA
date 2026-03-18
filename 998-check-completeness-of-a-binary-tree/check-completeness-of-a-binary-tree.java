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
    public int count(TreeNode root){
        if(root==null) return 0;

        return 1+count(root.left)+count(root.right);
    }
    public boolean dfs(TreeNode root,int i,int totalnodes){
        if(root==null) return true;

        if(i>totalnodes) return false;

        return dfs(root.left,2*i,totalnodes) && dfs(root.right,2*i+1,totalnodes);
    }
    public boolean isCompleteTree(TreeNode root) {
        //using dfs

        int totalnodes=count(root);
        int i=1;
        return dfs(root,i,totalnodes);
    }
}