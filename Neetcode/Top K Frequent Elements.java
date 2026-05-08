class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] op= new int[k];
        for(int i=0;i<k;i++){
            int key = 0;
            int maxx = Collections.max(map.values());
            for(int j : map.keySet()){
                if (maxx == map.get(j)){
                    key = j;
                    break;
                }
            }
            op[i]=key;
            map.remove(key);
        }
        return op;
    }
}

