package leccod;

import java.util.Arrays;

public class Offer098 {
    public static void main(String[] args) {
        System.out.println(new Offer098().uniquePaths(1, 1));
    }

    public int uniquePaths(int m, int n) {

        //创建二位数组
        int[][] dp = new int[m][n];
        //将第一列和第一行设置为1
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }

        //计算核心部分
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        Arrays.sort(dp[m-1]);
        return dp[m-1][n-1];
    }
}
