class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int tar=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && nums[tar]==0){
                int temp=nums[i];
                nums[i]=nums[tar];
                nums[tar]=temp;

                
            }
            if(nums[tar]!=0){
                tar++;

            }
        }
    }
}