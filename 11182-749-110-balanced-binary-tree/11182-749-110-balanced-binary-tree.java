
class Solution {
    public boolean isBalanced(TreeNode root) {
        // Vivek Yadav 110. Balanced Binary Tree
        if(root==null)return true;
        int lh=height(root.left);
        if(root.left!=null)lh++;
        int rh=height(root.right);
        if(root.right!=null)rh++;
        int d=lh-rh;
        if(d<0)d=-d;
        if(d>1)return false;
        return (isBalanced(root.left)&&isBalanced(root.right));
    }
    public int height(TreeNode root){
        if(root==null||(root.left==null &&root.right==null))return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}