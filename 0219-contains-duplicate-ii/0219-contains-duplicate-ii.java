class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer>seenNumber=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!seenNumber.add(nums[i])){
               
                              return true;
                
               
            }
            if(i>=k)
            seenNumber.remove(nums[i-k]);
        }
        return false;
    }
}