class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> cur = new ArrayList<>();
       boolean[] used = new boolean[nums.length];
       backtracking(nums,res,cur,used);
       return res;
    }
    private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> cur, boolean[] used){
        if(cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            cur.add(nums[i]);
            used[i]=true;
            backtracking(nums,res,cur,used);
            cur.remove(cur.size()-1);
            used[i]=false;
        }
    }
}
