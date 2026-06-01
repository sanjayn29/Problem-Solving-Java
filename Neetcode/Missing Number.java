class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        int now = 0;
        for(int i : nums){
            now += i;
        }
        return total - now;
    }
}