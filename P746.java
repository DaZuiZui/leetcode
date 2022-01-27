package leccod;

import lancup.lancup2021.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class P746 {
    public static void main(String[] args) {
        System.out.println(new P746().minCostClimbingStairs(new int[]{10,15,20}));
    }


    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < dp.length ; i++) {
            if (i-1 > cost.length)
                break;
            dp[i] = Math.min(cost[i]+ dp[i-1],dp[i-2]+ cost[i]);
        }

        return dp[dp.length -1] < dp[dp.length -2] ?dp[dp.length -1]: dp[dp.length -2];
    }
}
