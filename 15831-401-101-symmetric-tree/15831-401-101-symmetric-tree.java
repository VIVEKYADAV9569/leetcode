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
//  VIVEK YADAV 101. Symmetric Tree
class Solution {

    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        root.left=invert(root.left);
        return same(root.left,root.right);
    }
    // SAME TREE
    public boolean same(TreeNode p,TreeNode q){
        if(p==null&&q==null)return true;
        if(p==null||q==null)return false;
        if(p.val!=q.val)return false;
        return same(p.left,q.left)&&same(p.right,q.right);
    }
    public TreeNode invert(TreeNode root){
        if(root==null)return root;
        TreeNode temp=root.left;
       root.left= root.right;
       root.right=temp;
       invert(root.left);
       invert(root.right);
       return root;

    }
}