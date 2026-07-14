class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> uniqe = new ArrayList<>();
        uniqe.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                uniqe.add(arr[i]);
            }
        }
        return uniqe;
    }
}
