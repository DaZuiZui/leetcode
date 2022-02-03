package leccod;

public class P47Offer {
    public static void main(String[] args) {

    }

    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        //赋值第一行
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }

        //初始化行
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }

        //计算核心部分
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j] + grid[i][j],dp[i][j-1] +grid[i][j]);
            }
        }

        return dp[grid.length -1][grid[0].length -1];
    }
}
