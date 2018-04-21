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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root==null) return l;
        boolean b = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int n = q.size();
            for(int i=0; i< n; i++) {
                TreeNode temp = q.poll();
                if(b == true){ l.add(temp.val); b = false; }
                if(temp.right!=null) q.offer(temp.right);
                if(temp.left!=null) q.offer(temp.left);
            }
            b = true;
        }
        return l;
    }
}