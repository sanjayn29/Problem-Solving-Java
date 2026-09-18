class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        boolean flag = true;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                if(flag){
                    if(palid(s,l+1,r)){
                        return true;
                    }
                    if(palid(s,l,r-1)){
                        return true;
                    }
                    return false;
                }else{
                    return false;
                }
            }else{
            l++;
            r--;
        }}
        return true;
    }
    public boolean palid(String s, int l, int r){
        while(l<=r){
             if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
            l++;
            r--;
        }
        return true;
    }
}