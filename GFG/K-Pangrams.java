// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        // code here
        HashSet<Character> set = new HashSet<>();
        
        int n = 0;
        for (char chr : str.toCharArray()){
            if(chr != ' '){
            set.add(chr);
            n++;
        }
        }
        if (n < 26){
            return false;
        }
        return (26-set.size())<=k; 
    }
}