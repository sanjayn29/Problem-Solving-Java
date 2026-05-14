class Solution {
    public int majorityElement(int[] nums) {
        int ans = -1;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}