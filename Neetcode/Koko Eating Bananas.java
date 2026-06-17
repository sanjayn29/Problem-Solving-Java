class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i : piles){
            high = Math.max(i,high);
        }
        int ans = high;
        while(low <= high){
            int mid = low+(high-low)/2;
            long hour = 0;
            for(int i:piles){
                hour += (i+mid-1)/mid;
            }
            if(hour <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
