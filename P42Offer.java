package leccod;

import java.util.Arrays;

public class P42Offer {
    public static void main(String[] args) {
        System.out.println(new P42Offer().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length ==1){
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(nums[i]+dp[i-1],nums[i]);
        }

        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
