package day3;

import java.util.Arrays;

public class P300 {
    public static void main(String[] args) {
        System.out.println(new P300().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    public int lengthOfLIS(int[] nums) {
        int res =0;
        int n = nums.length;;
        if (n == 1){
            return 1;
        }
        int[] dp = new int[n];
        Arrays.fill(dp,1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res =Math.max(res,dp[i]);
        }

        return res;
    }
}
