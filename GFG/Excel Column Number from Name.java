class Solution {
    public int excelColumnNumber(String s) {
        // code here
        int ans = 0;
        char n = 'A';
        int j = (int)n;
        for(int i=0;i<s.length();i++){
            int value = (int) s.charAt(i) - j+1;
            ans = ans*26 + value;
        }
        return ans;
    }
}