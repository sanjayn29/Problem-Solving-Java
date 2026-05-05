class Solution {
    int countWords(String[] list) {
        // code here
        int op=0;
        HashMap <String, Integer> map = new HashMap<>();
        for(int i=0;i<list.length;i++){
            map.put( list[i] , map.getOrDefault((list[i]),0)+1 );
        }
        for(int i : map.values()){
            if (i == 2){
                op=op+1;
            } 
        }
        return op;
    }
}