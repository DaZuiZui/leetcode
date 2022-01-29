package leccod;

import java.util.Arrays;

/**
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 */
public class P121 {
    public static void main(String[] args) {
        new P121().maxProfit(new int[]{7,1,5,3,6,4});
    }

    /**
     * 思路
     *      dp存放的利润
     *      dp[0] = 0； 代表第一天利润是0圆
     *
     *  每天都比较下，如果不持仓利润大还是持仓了利润大 ，如果不持仓利润就是0
     *  持仓算法：  昨天最大利润 - （昨日股票价格 - 今日股票价格）
     *
     */
    public int maxProfit(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;

        for (int i =1 ; i < dp.length ;i++){
            dp[i] = Math.max(0,dp[i-1] - (nums[i-1] - nums[i]));
        }

        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
