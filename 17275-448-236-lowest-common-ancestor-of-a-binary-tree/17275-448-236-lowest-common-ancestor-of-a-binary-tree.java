
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root ||q==root)return root;
        if(p==q)return p;
        boolean leftP=contains(root.left,p);
        boolean rightR=contains(root.right,q);
        if((leftP &&  rightR)||(!leftP&&!rightR))return root;
        if(leftP && !rightR)return lowestCommonAncestor(root.left,p,q);
        if(!leftP && rightR)return lowestCommonAncestor(root.right,p,q);
        return root;
       
    
    }
    public boolean contains(TreeNode root,TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
        return contains(root.left,node)||contains(root.right,node);
    }
}