package leccod;

import java.util.Arrays;

public class MST1617 {
    public static void main(String[] args) {
        System.out.println(new MST1617().maxSubArray(new int[]{-2, -1}));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }else if (nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
        }

        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
