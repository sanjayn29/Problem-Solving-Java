class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxy = 0;
        while(left < right){
            int width = right-left;
            int hight = Math.min(height[right],height[left]);
            int area = width *hight;
            maxy = Math.max(area,maxy);
            if(height[right] > height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxy;       
    }
}