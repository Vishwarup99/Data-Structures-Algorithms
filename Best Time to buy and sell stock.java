class Solution {
    public int maxProfit(int[] prices) {
        int profit =0, maxProfit = 0;
        int buy = prices[0];

        for(int i=0;i<prices.length;i++) {
            if (prices[i] < buy){
                buy = prices[i];
            } else {
                profit = prices[i] - buy;
                maxProfit = Math.max(profit,maxProfit);
            }
        }

        return maxProfit;
    }
}
