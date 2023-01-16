package day3;

public class P122 {
    public static void main(String[] args) {
        System.out.println(new P122().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        // dp[i][1]第i天持有的最多现金
        // dp[i][0]第i天持有股票后的最多现金
        int[][] dp= new int[n][2];
        dp[0][0] =-prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < n; i++) {
            dp[i][0] =  Math.max(dp[i-1][1] - prices[i],dp[i-1][0]);
            dp[i][1] =  Math.max(dp[i-1][1],dp[i][0] + prices[i]);
        }

        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }
}
