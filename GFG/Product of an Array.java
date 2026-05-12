/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long sum = 1;
        for(long i: arr){
            sum = (sum * i) % 1000000007;
        }
        return sum;
    }
}