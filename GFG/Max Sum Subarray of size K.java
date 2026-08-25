class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int wind1 = 0;
        for(int i=0;i<k;i++){
            wind1+=arr[i];
        }
        int wind2 = wind1;
        for(int i=k;i<arr.length;i++){
            wind1+=arr[i];
            wind1-=arr[i-k];
            wind2 = Math.max(wind2,wind1);
        }
        return wind2;
    }
}