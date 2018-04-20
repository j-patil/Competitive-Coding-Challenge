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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !s.empty()){
            while(temp!=null){
                l.add(temp.val);
                s.push(temp);
                temp = temp.left;
            }
            temp = s.pop();
            temp = temp.right;
        }
        return l;
    }
}