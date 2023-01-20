package day6;

import java.util.Arrays;

public class P279 {
    public static void main(String[] args) {
        System.out.println(new P279().numSquares(12));
    }

    public int numSquares(int n) {
        //定义背包
        int[] dp = new int[n+1];
        //初始化
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        //遍历物品
        for (int i = 1; i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                dp[j] = Math.min(dp[j],dp[j - i * i] +1);
            }
        }

        return dp[n];
    }
}
