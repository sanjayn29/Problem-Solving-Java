class Solution {
    public String colName(int columnNumber) {
        // code here
        String ans = "";
        while(columnNumber > 0){
            columnNumber = columnNumber -1;
            int rem = columnNumber%26;
            ans += (char)((int)'A'+rem);
            columnNumber=columnNumber/26;
        }
        return new StringBuilder(ans).reverse().toString();
    }
}