class Solution {
    public int remAnagram(String s1, String s2) {
        // code here
        HashMap <Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char n = s2.charAt(i);
            map.put(n, map.getOrDefault(n,0)-1);
        }
        int sum=0;
        for(int i : map.values()){
            sum += Math.abs(i);
        }
        return sum;
    }
}