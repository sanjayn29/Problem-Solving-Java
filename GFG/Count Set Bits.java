// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int res = 0;
        while(n > 0){
            res += (n & 1);
            n = n >> 1;
        }
        return res;
    }
}