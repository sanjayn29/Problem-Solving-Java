class Solution {
    int majorityElement(int arr[]) {
        // code here
        int ans = -1;
        int max = 0;
        int len = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if ( e.getValue() > max ){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        if (max > len / 2) {
            return ans;
        }
        return -1;
    }
}