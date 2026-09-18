class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] user = new boolean[arr.length];
        
        backtracking(arr,res,cur,user);
        
        return res;
    }
    
    private static void backtracking(int[] arr, ArrayList<ArrayList<Integer>> res, List<Integer> cur, boolean[] user){
        if(cur.size() == arr.length){
            res.add(new ArrayList<>(cur));
        }
        for(int i=0;i<arr.length;i++){
            if(user[i]){
                continue;
            }
            cur.add(arr[i]);
            user[i] = true;
            backtracking(arr,res,cur,user);
            cur.remove(cur.size() - 1);
            user[i] = false;
        }
    }
};