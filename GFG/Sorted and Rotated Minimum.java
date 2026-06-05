class Solution {
    public int findMin(int[] nums) {
        // code here
        int min = nums[0];
        for(int i : nums){
            min = Math.min(min,i);
        }
        return min;
    }
}
