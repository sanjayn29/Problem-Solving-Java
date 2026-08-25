class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peekFirst()<i-k+1){
                q.pollFirst();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<arr[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(i>=k-1){
                result.add(arr[q.peekFirst()]);
            }
        }
        return result;
    }
}