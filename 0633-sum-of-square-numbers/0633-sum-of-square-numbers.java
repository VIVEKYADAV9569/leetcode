class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            long current=left*left+right*right;
            if(current<c){
                left++;

            }
            else if(current>c){
                right--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}