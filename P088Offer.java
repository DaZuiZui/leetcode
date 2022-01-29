package leccod;

public class P088Offer {
    public static void main(String[] args) {
        System.out.println(new P088Offer().minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i],dp[i-2]+cost[i]);
        }

        return dp[dp.length-1] < dp[dp.length-2] ? dp[dp.length-1] :dp[dp.length-2] ;
    }
}
