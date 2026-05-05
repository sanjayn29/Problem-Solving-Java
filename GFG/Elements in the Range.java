class Solution {
    public boolean checkElements(int start, int end, List<Integer> arr) {
        // code here
        int s=start;
        boolean flag;
        while(s<=end){
            flag=false;
            for(int i=0;i<arr.size();i++){
                if (s==arr.get(i)){
                    flag=true;
                }
            }
            if(flag==false){
                return flag;
            }
            s=s+1;
        }
        return true;
    }
}