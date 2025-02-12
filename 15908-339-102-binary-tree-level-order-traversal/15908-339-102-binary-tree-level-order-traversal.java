/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
        norder(root,0,result);
        return result;
    }
    private static void norder(TreeNode root,int n,List<List<Integer>>result){
        if(root==null )return;
        if(result.size()==n){
            List<Integer>ai=new ArrayList<>();
           ai.add(root.val);
           result.add(ai);
        } 
       else result.get(n).add(root.val);
        norder(root.left,n+1,result);
        norder(root.right,n+1,result);
    }
}