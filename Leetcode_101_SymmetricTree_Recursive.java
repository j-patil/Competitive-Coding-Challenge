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
        return root==null || checkTree(root.left, root.right);
    }
    
    public boolean checkTree(TreeNode l, TreeNode r){
        if(l == null && r == null) return true;
        if(l==null && r != null || l!= null && r == null) return false;
        if(l.val == r.val) return checkTree(l.left, r.right) && checkTree(l.right, r.left);
        else return false;
    }
}