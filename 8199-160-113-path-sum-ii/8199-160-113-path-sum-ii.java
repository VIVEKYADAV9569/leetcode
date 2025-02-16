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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        preorder(ans,a,root,targetSum);
       
        return ans;

    }
    public void preorder(List<List<Integer>>ans, List<Integer>a,TreeNode root, int targetSum){
        if(root==null)return ;
        targetSum=   targetSum-root.val;
        a.add(root.val);
        if(root.left == null && root.right == null &&targetSum==0){
            ans.add(a);
        }
        preorder(ans,new ArrayList<>(a),root.left,targetSum);
        preorder(ans,new ArrayList<>(a),root.right,targetSum);
          }
}