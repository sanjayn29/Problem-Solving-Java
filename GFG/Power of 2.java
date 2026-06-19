class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        int valid = n&(n-1);
        if(n>0 && valid==0){
            return true;
        }
        return false;
    }
}