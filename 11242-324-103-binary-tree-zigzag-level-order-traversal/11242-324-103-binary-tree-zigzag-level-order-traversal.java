
class Solution {
   
    public static int height(TreeNode root){
        if(root==null||(root.left==null && root.right==null))return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public  void nlevel(TreeNode root,int n, List<Integer>li){
        if(root==null)return;
        if(n==1){
            li.add(root.val);
            return;
        }
        nlevel(root.left,n-1,li);
        nlevel(root.right,n-1,li);
    }
     public void nlevel2(TreeNode root,int n, List<Integer>li){
        if(root==null)return;
        if(n==1){
            li.add(root.val);
            return;
        }
        nlevel2(root.right,n-1,li);
        nlevel2(root.left,n-1,li);
    }
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        int level=height(root)+1;
         
         List<List<Integer>>ans=new ArrayList<>();
         if(root==null)return ans;
        for(int i=1;i<=level;i++){
            List<Integer>li=new ArrayList<>();
            if(i%2!=0) nlevel(root,i,li);
              else nlevel2(root,i,li);
            
            ans.add(li);
        } 
        return ans;
    }
}