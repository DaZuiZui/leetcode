package day6;

public class P377 {
    public static void main(String[] args) {
        System.out.println(new P377().combinationSum4(new int[]{1,2,3}, 4));
    }

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;

        /**
         * 如果不考虑排序的情况那么就先遍历物品，在遍历背包
         * 如果考虑排序的情况那么就先遍历背包，在遍历物品
         */
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j])
                    dp[i] += dp[i-nums[j]];
            }
        }

        return dp[target];
    }
}
