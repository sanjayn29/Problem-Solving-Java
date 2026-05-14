class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {

        int len = arr.length;
        ArrayList<Integer> List = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if ( e.getValue() > len/3 ){
                List.add(e.getKey());
            }
        }
        Collections.sort(List);
        return List;
    }
}