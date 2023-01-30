public class P309 {
    public static void main(String[] args) {
        System.err.println(new P309().maxProfit(new int[]{2,1}));
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        //持有股票
        dp[0][0] = -prices[0];
        //清仓
        dp[0][1] = 0;
        //冻结的时候钱
        dp[0][2] = 0;

        for (int i = 1; i < prices.length; i++) {
            //计算购买股票的钱
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i-1][1],dp[i-1][2]);
        }

        return dp[prices.length-1][1];
    }
}
