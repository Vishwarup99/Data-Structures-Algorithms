class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;

        for(int x=1;x<=amount;x++){
            dp[x] = Integer.MAX_VALUE;
            for(int coin : coins) {
                if(x >= coin && dp[x-coin] != Integer.MAX_VALUE) {
                    dp[x] = Math.min(dp[x],dp[x-coin]+1);
                }
            }
        }
        
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
}
