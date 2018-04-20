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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(temp!= null || !s.empty()){
            while(temp!=null){
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            l.add(temp.val);
            temp = temp.right; 
        }
        return l;
    }
}