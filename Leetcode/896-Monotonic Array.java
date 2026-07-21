class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 1;
        int dec = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                inc = 0;
            }
            if(nums[i-1] < nums[i]){
                dec = 0;
            }
        }
        if(inc==1 | dec==1){
            return true;
        }
        return false;
    }
}