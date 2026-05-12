class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int curr = 1;
        int lon = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                curr++;
            }
            else{
                curr=1;
            }
            lon = Math.max(lon,curr);
       }
       return lon;
    }
}