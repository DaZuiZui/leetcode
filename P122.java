package leccod;

public class P122 {
    public static void main(String[] args) {
        System.out.println(new P122().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        //第一天不持有的价钱
        dp[0][0] = 0;
        //第一天持有的价钱
        dp[0][1] = -prices[0];

        //第二个交易日后的价钱
        /**
         * 第一个交易日
         *     不持仓   0元
         *     持仓    -7元        我当前仓库有多少前
         *
         * 第二次交易日
         *      不持仓   0元
         *      持仓    -1元
         *
         * 第三个交易日
         *      不持仓   4元
         *      持仓     -1
         *
         *  第三个交易日
         *     不持仓    4
         *     持仓      1
         *
         *  第四个交易日
         *      不持仓   7
         *      持仓     1
         *
         */
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            System.out.println(dp[i][0]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
            System.out.println(dp[i][1]);
            System.out.println();
        }

        return dp[prices.length-1][0];
    }

}
