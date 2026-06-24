class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] digits) {
        // code here
        int n = digits.length;
        
        for(int i=n-1;i>=0;i--){
            
            if(digits[i] < 9){
                digits[i]+=1;
                Vector<Integer> ans = new Vector<>();
                for(int num : digits) {
                    ans.add(num);
                }
                return ans;
            }
            digits[i]=0;
        }
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        for(int num : digits) {
            ans.add(num);
        }
        return ans;
    }
}