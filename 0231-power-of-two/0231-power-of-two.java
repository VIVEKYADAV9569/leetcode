class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==-1*n){
            return false;
        }
        return (n&(n-1))==0;
    }
}