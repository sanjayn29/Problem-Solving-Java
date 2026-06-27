class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        char n = 'A';
        int j = (int)n;
        for(int i=0;i<columnTitle.length();i++){
            int value = (int) columnTitle.charAt(i) - j+1;
            ans = ans*26 + value;
        }
        return ans;
    }
}