/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */

public class Solution {
    public void connect(TreeLinkNode root) {
        if((root == null) || (root.left== null && root.right == null)) return;
        Queue<TreeLinkNode> q = new LinkedList<>();
        if(root.left!= null) q.offer(root.left);
        if(root.right!= null) q.offer(root.right);
        while(q.size()>0) {
            int l = q.size();
            TreeLinkNode state = q.poll();
            if(state.left!=null) q.offer(state.left);
            if(state.right!=null) q.offer(state.right);
            for(int i = 1; i< l; i++){
                TreeLinkNode temp = q.poll();
                state.next = temp;
                state = temp;
                if(state.left!=null) q.offer(state.left);
                if(state.right!=null) q.offer(state.right);
            }     
        }
    }
}