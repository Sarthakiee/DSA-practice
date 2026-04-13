class Solution {
    public int maxProfit(int[] prices) {
        
        int minValToBuy = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i]<minValToBuy){
            minValToBuy = prices[i];
            }
            int profit = prices[i] - minValToBuy;
            max = Math.max(max,profit);
            
        }
        return max;
    }
}