class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wind1 = 0;
        for(int i=0;i<k;i++){
            wind1+=nums[i];
        }
        int wind2 = wind1;
        for(int i=k;i<nums.length;i++){
            wind1+=nums[i];
            wind1-=nums[i-k];
            wind2=Math.max(wind1,wind2);
        }
        double wind3 = wind2;
        return wind3/k;
    }
}