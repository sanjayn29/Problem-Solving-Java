class Solution {
    public boolean isPalindrome(String s) {

        String res = "";
        for(char i : s.toCharArray()){
            if(Character.isLetter(i) || Character.isDigit(i)){
                res+=Character.toLowerCase(i);
            }
        }

        int n = res.length();
        for(int i=0;i < n/2;i++){
            if(res.charAt(i) != res.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
