package day6;

public class P512 {
    public static void main(String[] args) {

    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;//背包容量为0 有一种办法，就是啥都不要

        //遍历物品
        for (int i = 0; i < coins.length; i++) {
            //遍历背包
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return coins[amount];
    }
}
