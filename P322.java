package leccod;

import java.util.Arrays;

public class P322 {
    public static void main(String[] args) {
        System.out.println(new P322().coinChange(new int[]{1,2,5,10}, 27));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp  = new int[amount+1];

        //初始化
        Arrays.fill(dp,-1);
        dp[0] = 0;

        for (int i = 1; i < amount+1; i++) {
             for (int j = 0; j < coins.length; j++) {
                //判断cosin金额是否小宇i，如果i小宇就判断最小值
                if (coins[j] <= i && dp[i-coins[j]] != -1 ){
                    //判断是否第一次
                    if (dp[i] == -1){
                        dp[i] = dp[i-coins[j]] + 1;
                        continue;
                    }
                    dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }

        return dp[amount];
    }
}
