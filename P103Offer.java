package leccod;

import java.util.Arrays;

public class P103Offer {
    public static void main(String[] args) {
        
    }

    public int coinChange(int[] coins, int amount) {
        //设置所有数为-1
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        
        for (int i = 1; i < amount+1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && dp[i-coins[j]] != -1){
                    //判断是否为第一次
                    if (dp[i] == -1){
                        dp[i] = dp[i - coins[j]]+1;
                        continue;
                    }

                    dp[i]= Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }    
        }
        
        return dp[amount];
    }
}
