class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(String str: arr){
            
            char[] word = str.toCharArray();
            
            Arrays.sort(word);
            
            String key = new String(word);
            
            map.putIfAbsent(key, new ArrayList<>());
            
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
    