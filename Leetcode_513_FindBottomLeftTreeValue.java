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
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int left = root.val;
        boolean count = true;
        while(q.size()>0){
            int n = q.size();
            for(int i=0; i<n; i++){
                TreeNode temp = q.poll();
                if(count) {left = temp.val; count = false;}
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
            count = true;
        }
        return left;
    }
}