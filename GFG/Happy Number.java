// User function Template for Java

class Solution {

    static int isHappy(int n) {
        // code here
        if( n==1 || n==7 ){
            return 1;
        }
        if( n < 10 ){
            return 0;
        }
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            sum += digit*digit;
            n = n/10;
        }
        return isHappy(sum);
    }
}