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
    public String solve(TreeNode root,HashMap<String,Integer> map,ArrayList<TreeNode> res){
        if(root==null){
            return "N";
        }
        String s=(root.val)+","+solve(root.left,map,res)+","+solve(root.right,map,res);

        int count = map.getOrDefault(s, 0);
        if (count == 1) {
        res.add(root);
        }
        map.put(s, count + 1);

        return s;
    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<TreeNode> res=new ArrayList<>();

        solve(root,map,res);
        return res;
    }
}