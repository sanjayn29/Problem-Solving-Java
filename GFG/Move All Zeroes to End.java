class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        for(int j=pos;j<nums.length;j++){
            nums[j]=0;
        }
    }
}