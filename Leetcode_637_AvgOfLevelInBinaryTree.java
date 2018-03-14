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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> l = new ArrayList<>();
        if(root == null){ l.add(0.0); return l;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Double result = 0.0;
        while(q.size()>0){
            int n = q.size();
            for(int i = 0; i< n; i++){
                TreeNode temp = q.poll();
                result += temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            l.add(result/n);
            result=0.0;
        }
        return l;
    }
}