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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int result = 0;
        while(q.size()>0){
            TreeNode temp = q.poll();
            if(temp.left!=null) {
                if(temp.left.left == null && temp.left.right == null)
                    result+=temp.left.val;
                else{
                    q.offer(temp.left);
                }
            }
            if(temp.right!=null) q.offer(temp.right);
        }
        return result;
    }
}