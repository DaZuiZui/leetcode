import java.util.Arrays;

public class P45 {
    public static void main(String[] args) {
        new P45().jump(new int[]{1,2});
    }

    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if (i+j == nums.length){
                    return dp[dp.length-1];
                }

                dp[i+j] = Math.min(dp[i]+1,dp[i+j]);
                System.out.println(dp[i+j]);
            }
        }

        return dp[dp.length-1];
    }
}
