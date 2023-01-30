public class P714 {
    public static void main(String[] args) {
        System.err.println(new P714().maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        //持有
        dp[0][0] = -prices[0];
        //清仓后的钱
        dp[0][1] = 0;
        for (int i = 1; i < n; i++) {
            //买入
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] - prices[i]);
            //卖出
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] + prices[i] - fee);
        }

        return dp[n-1][1];
    }
}
