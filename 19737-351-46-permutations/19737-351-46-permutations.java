class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result=new ArrayList<>();
         backtrack(result,new ArrayList<>(),nums);
         return result;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer>li,int[] nums){
        if(li.size()==nums.length){
          result.add(new ArrayList<>(li));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(li.contains(nums[i]))continue;
                li.add(nums[i]);
                backtrack(result,li,nums);
                li.remove(li.size()-1);
            }
        }
    }
}