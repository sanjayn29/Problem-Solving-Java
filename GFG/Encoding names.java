
class Solution {
    static String encodeTheName(String S) {
        // code here
        String res = "";
        int len = S.length();
        int sub = 10;
        for(int i=0;i<len;i++){
            int asci = (int) S.charAt(i);
            asci = asci - sub;
            res=res+String.valueOf(asci);
            sub--;
        }
        return res;
    }
};