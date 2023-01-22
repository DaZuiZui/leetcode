public class LCP518 {
    public static void main(String[] args) {
        System.out.println(new LCP518().change(5, new int[]{1, 2, 5}));
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;  //当背包容量为0，只有一种办法，就是啥都不要

        //先遍历物品
        for (int i = 0; i < coins.length; i++) {
            //在遍历背包
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j-coins[i]];
            }
        }

        return dp[amount];
    }
}
