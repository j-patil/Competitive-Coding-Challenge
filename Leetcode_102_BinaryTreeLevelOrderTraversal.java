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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();
        if(root == null) {return new ArrayList(0);}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            l1.add(new ArrayList(l));
        }
        return l1;
    }
}