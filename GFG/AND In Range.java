class Solution {
    public int andInRange(int left, int right) {
        // Code here
        int result = 0;
        while(left<right){
            left >>=1;
            right >>=1;
            result++;
        }
        return left<<result;
    }
}
