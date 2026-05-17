class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] op = new int[n];
        op[0] = 1;
        int suff = 1;
        for(int i=1;i<n;i++){
            op[i] = op[i-1]*nums[i-1];
        }
        for(int j=n-1;j>=0;j--){
            op[j]=suff*op[j];
            suff=suff*nums[j];
        }  
        return op;
    }
}