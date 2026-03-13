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
    int maxsum;
    public int solve(TreeNode root){
        if(root==null) return 0;

        int l=solve(root.left);
        int r=solve(root.right);

        int mil_gya=l+r+root.val;//(1)

        int koi_ek=Math.max(l,r)+root.val;//(2)

        int only_root=root.val;//(3)

        maxsum = Math.max(maxsum, Math.max(mil_gya, Math.max(koi_ek, only_root)));

        return Math.max(koi_ek,only_root);



    }
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        solve(root);
        return maxsum;
    }
}