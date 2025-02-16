
class Solution {
    //    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
    //    target=targetSum;
      
       return  sum(root,0,targetSum);
    }
    private  boolean sum(TreeNode root,int sum,int targetSum){
        if(root==null)return false;
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
            return sum==targetSum;
        }
        boolean leftAns=sum(root.left,sum,targetSum);
        boolean rightAns=sum(root.right,sum,targetSum);
        return leftAns||rightAns;
    }
}