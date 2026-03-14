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
    int max=0;

    public void solve(TreeNode root,int step,boolean goleft){
        if(root==null) return;

        max=Math.max(max,step);

        if(goleft){
            solve(root.left,step+1,false);
            solve(root.right,1,true);
        }
        else{
            solve(root.right,step+1,true);
            solve(root.left,1,false);
        }
    }
    public int longestZigZag(TreeNode root) {
        solve(root,0,true);
        solve(root,0,false);
        return max;
    }
}