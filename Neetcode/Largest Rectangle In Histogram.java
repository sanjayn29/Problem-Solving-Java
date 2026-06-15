class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        int n = heights.length;

        for(int i=0;i<=n;i++){
            int curr = (i == n)?0:heights[i];
            while(!stack.isEmpty() && curr < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                maxarea = Math.max(maxarea,height*width);
            }
            stack.push(i);
        }
        return maxarea;
    }
}