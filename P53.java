package leccod;

import java.util.Arrays;

/**
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
public class P53 {
    public static void main(String[] args) {
        System.out.println(new P53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    /**
     *  思路先设置dp[0] = nums[0]
     *  dp[i] = dp[i-1] +mums[i]
     *
     *  之后在对dp数组排序，然后直接获取最后一位
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] +dp[i-1],nums[i]);
        }

        Arrays.sort(dp);


        return dp[dp.length-1];
    }
}
