class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<n;i++){
            while(!val.isEmpty() && temperatures[i] > temperatures[val.peek()]){
                int index = val.pop();
                res[index] = i - index;
            }
            val.push(i);
        }
        return res;
    }
}