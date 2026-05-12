class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int cur = 1;
        int lon = 1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                cur++;
            }
            else{
                cur=1;
            }
            lon = Math.max(cur,lon);
        }
        return lon;        
    }
}
