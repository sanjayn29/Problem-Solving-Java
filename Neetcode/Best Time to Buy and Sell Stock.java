class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int pro = 0;
        for(int price : prices){
            if(price < min ){
                min = price;
            }
            int max = price-min;
            if(pro < max){
                pro = max;
            }
        }
        return pro;
    }
}
