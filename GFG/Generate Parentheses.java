class Solution {
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> paren = new ArrayList<>();
        backtracking(paren, "",0,0,n/2);
        return paren;
    }
    
    public static void backtracking(ArrayList<String> paren,String curr,int open,int close,int n){
        if(curr.length() == 2*n){
            paren.add(curr);
            return;
        }
        if(open < n){
            backtracking(paren,curr+"(",open+1,close,n);
        }
        if(close < open){
            backtracking(paren,curr+")",open,close+1,n);
        }
    }
}