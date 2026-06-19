// User function Template for Java

class Solution {
    public int reverseDigits(int x) {
        // Code here
        int result = 0;
        while(x!=0){
            result = (result*10)+x%10;
            x /= 10;
        }
        return result;
    }
}