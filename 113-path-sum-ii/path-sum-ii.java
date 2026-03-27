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
    List<List<Integer>> res = new ArrayList<>();

    public void solve(TreeNode root, int sum, List<Integer> temp, int targetSum) {
        if (root == null) return;

        sum += root.val;
        temp.add(root.val);

        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                res.add(new ArrayList<>(temp)); // ✅ copy list
            }
            temp.remove(temp.size() - 1); // ✅ backtrack
            return;
        }

        solve(root.left, sum, temp, targetSum);
        solve(root.right, sum, temp, targetSum);

        temp.remove(temp.size() - 1); // ✅ backtrack
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;
        List<Integer> temp = new ArrayList<>();

        solve(root, sum, temp, targetSum);
        return res;
    }
}