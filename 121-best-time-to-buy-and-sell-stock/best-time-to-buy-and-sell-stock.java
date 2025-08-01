class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy_price=prices[0];
        int max_profit=0;
        for(int i=1;i<n;i++){
            int current_profit=prices[i]-buy_price;
            if(current_profit>max_profit){
                max_profit=current_profit;
            }
            if(buy_price>prices[i]){
                buy_price=prices[i];
            }
        }
        return max_profit;
        
    }
}