class Solution {
    public boolean isPalindrome(int n) {
        // code here
        String n2 = String.valueOf(n);
        String res = "";
        for(char i: n2.toCharArray()){
            if(Character.isDigit(i)){
                res=res+i;
            }
        }
        int len = res.length();
        for(int i=0;i < len;i++){
            if(res.charAt(i) != res.charAt(len-1-i)){
                return false;
            }
        }  
        return true;
    }   
}