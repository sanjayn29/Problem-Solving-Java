class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev = 0;
        int base = n;
        while(n > 0){
            int digit = n%10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        return (int)Math.pow(base,rev);
    }
}
