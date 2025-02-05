class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        int maxi=nums[0];
        int mini=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxi;
                maxi=mini;
                mini=temp;
            }
            maxi=Math.max(nums[i],maxi*nums[i]);
            mini=Math.min(nums[i],mini*nums[i]);
            result=Math.max(result,maxi);
        }
        return result;
    }
}