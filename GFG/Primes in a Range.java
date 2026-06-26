class Solution {
    public List<Integer> primeRange(int l, int r) {
        // code here
        boolean[] prime = new boolean[r+1];
        for(int i=0;i<=r;i++){
            prime[i]=true;        
        }
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=Math.sqrt(r);i++){
            if(prime[i]){
                for(int j=i*i;j<=r;j+=i){
                    prime[j]=false;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int k=Math.max(2,l);k<=r;k++){
            if(prime[k]){
                res.add(k);
            }
        }
        return res;
    }
}