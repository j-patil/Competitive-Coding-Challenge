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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        if(root.left == null && root.right == null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            TreeNode temp = q.poll();
            TreeNode l = temp.left;
            TreeNode r = temp.right;
            temp.left = r;
            temp.right = l;
            if(r!=null) q.offer(r);
            if(l!=null) q.offer(l);
        }
        return root;
    }
}