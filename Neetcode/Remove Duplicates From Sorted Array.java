class Solution {
    public int removeDuplicates(int[] nums) {
       int neww =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[neww]=nums[i];
                neww++;
            }
        }
        return neww; 
    }
}