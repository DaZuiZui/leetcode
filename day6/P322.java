package day6;

import java.util.Arrays;

public class P322 {
    public static void main(String[] args) {
        System.out.println(new P322().coinChange(new int[]{1, 2, 5}, 1));
    }

    public int coinChange(int[] coins, int amount) {
        //定义dp
        int[] dp = new int[amount+1];
        //初始化
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0; //0块钱就是0种选择

        //遍历物品
        for (int i = 0; i < coins.length; i++) {
            //遍历背包
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j-coins[i]] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[i],dp[j-coins[i]]+1);
            }
        }

        //没有匹配成功
        if (dp[amount] == Integer.MAX_VALUE) return -1;

        return dp[amount];
    }
}
