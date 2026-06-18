// User function Template for Java

class Solution {
    public double medianOf2(int nums1[], int nums2[]) {
        // Your Code Here
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;

        for(int num : nums1){
            arr[k++]=num;
        }   
        for(int num : nums2){
            arr[k++]=num;
        }

        Arrays.sort(arr);
        int n = arr.length;
        
        return (arr[n/2] + arr[n/2-1])/2.0;
    }
}