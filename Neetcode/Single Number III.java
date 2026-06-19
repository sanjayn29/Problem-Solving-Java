class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int[] res = new int[2];
        int ind = 0;
        for(int key : freq.keySet()){
            if(freq.get(key) == 1){
                res[ind]=key;
                ind++;
            }
        }
        return res; 
    }
}