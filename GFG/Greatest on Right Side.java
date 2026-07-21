class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int n = arr.length-1;
        int max = arr[n];
        arr[n] = -1;
        for(int i=n-1;i>=0;i--){
            if(max < arr[i]){
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
            else{
                arr[i]=max;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i:arr){
            res.add(i);
        }
        return res;
    }
}