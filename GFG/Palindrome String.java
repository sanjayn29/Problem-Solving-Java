class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        for(char i: s.toCharArray()){
            if(Character.isLetter(i)){
                res.append(i);
            }
        }
        String op = res.toString();
        int len = op.length();
        for(int i=0;i < len/2;i++){
            if(op.charAt(i) != op.charAt(len-1-i)){
                return false;
            }
        }  
        return true;
    }
}