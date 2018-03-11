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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        
        while(q.size()>0){
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            if(l==null && r==null) continue;
            if((l == null && r !=null) || (l != null && r ==null)) return false;
            if(l.val == r.val){
                q.add(l.left);
                q.add(r.right);
                q.add(l.right);
                q.add(r.left);
            } else return false;
        }
        return true;
    }
}