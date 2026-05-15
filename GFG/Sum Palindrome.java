// User function Template for Java
class Solution {
    static int isSumPalindrome(int n) {
        // code here
        String nn = String.valueOf(n);
        if(nn.equals(new StringBuilder(nn).reverse().toString())){
                return n;
        }
        for(int i=0;i<5;i++){
            String rev = new StringBuilder(String.valueOf(n)).reverse().toString();
            n = n + Integer.parseInt(rev);
            String res = String.valueOf(n);
            if(res.equals(new StringBuilder(res).reverse().toString())){
                return n;
            }
        }
        return -1;
    }
}