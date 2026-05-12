class Solution {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        if(arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);
        int cur = 1;
        int lon = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                cur++;
            }
            else{
                cur=1;
            }
            lon = Math.max(lon,cur);
        }
        return lon;
    }
}