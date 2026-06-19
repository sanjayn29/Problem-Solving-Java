class Solution {
    public boolean isPowerOfTwo(int n) {
        int valid = n&(n-1);
        if(n>0 && valid==0){
            return true;
        }
        return false;
    }
}