// User function template for Java
class Solution {
    static int commonSubseq(String s1, String s2) {
        // code here
        HashMap <Character ,Integer> map = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),1);
        }
        
        for(int i=0;i<s2.length();i++){
            if (map.containsKey(s2.charAt(i))){
                return 1;
            }
        }
        
        return 0;
        
    }
}