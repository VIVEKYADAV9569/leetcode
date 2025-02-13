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
    public int diameterOfBinaryTree(TreeNode root) {
         if(root==null||((root.left==null&&root.right==null)))return 0;
   int leftans=diameterOfBinaryTree(root.left);
   int rightans=diameterOfBinaryTree(root.right);
   int mid=height(root.left)+height(root.right);
   if(root.right!=null)mid++;
   if(root.left!=null)mid++;
   int max=Math.max(leftans,Math.max(rightans,mid));
   return max;
   }
    public  int height(TreeNode root){
        if(root==null||(root.left==null&&root.right==null))return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}