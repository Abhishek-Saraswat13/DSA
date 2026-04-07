/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> parent=new HashMap<>();
    public void inorder(TreeNode root){
        if(root==null) return;

        if(root.left!=null){
            parent.put(root.left,root);
        }
        inorder(root.left);

        if(root.right!=null){
            parent.put(root.right,root);
        }
        inorder(root.right);

    }
    public void bfs(TreeNode target,int k,List<Integer> res){
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(target);

        HashSet<Integer> visited = new HashSet<>();
        visited.add(target.val);

        while(!q.isEmpty()){
            int size=q.size();
            if(k==0) break;

            while(size-->0){
                TreeNode curr=q.poll();

                if (curr.left != null && !visited.contains(curr.left.val)) {
                    q.offer(curr.left);
                    visited.add(curr.left.val);
                }

                if (curr.right != null && !visited.contains(curr.right.val)) {
                    q.offer(curr.right);
                    visited.add(curr.right.val);
                }

                if (parent.containsKey(curr) && !visited.contains(parent.get(curr).val)) {
                    q.offer(parent.get(curr));
                    visited.add(parent.get(curr).val);
                }


            }
            k--;
        }
        while (!q.isEmpty()) {
        res.add(q.poll().val);
    }
    } 
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        inorder(root);
        bfs(target,k,res);
        return res;
    }
}