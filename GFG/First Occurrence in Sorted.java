class Solution {
    public int firstSearch(int[] nums, int target) {
        // Code Here
        int left = 0;
        int right = nums.length -1;
        int ans = -1;
        while(left <= right ){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans =  mid;
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}