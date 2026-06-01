class Solution {
    int missingNum(int nums[]) {
        // code here
        int n = nums.length+1;
        long total = (long)n*(n+1)/2;
        long now = 0;
        for(int i : nums){
            now += i;
        }
        return (int)(total - now);
    }
}