class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] op = new int[k];
        for(int i=0;i<k;i++){
            int maxx = Collections.max(map.values());
            int key = 0;
            // Find key having max frequency
            for (int x : map.keySet()) {
                if (map.get(x) == maxx) {
                    key = x;
                    break;
                }
            }
            op[i] = key;
            map.remove(key);
        }
        return op;
    }
}