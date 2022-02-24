package leccod;

public class P152 {
    public static void main(String[] args) {
        System.out.println(new P152().maxProduct(new int[]{2, 3, -2, 4}));
    }

    public int maxProduct(int[] nums) {
        if (nums.length == 1){
            if (nums[0] < 0){
                return 0;
            }else{
                return  nums[0];
            }
        }
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int max = 0;

        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0] * nums[i],Math.max(dp[i-1][1]*nums[i],nums[i]));
            dp[i][1] = Math.min(dp[i-1][1] * nums[i],Math.min(dp[i-1][0]*nums[i],nums[i]));
        }

        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i][0],Math.max(dp[i][0],max));
        }

        return max;
    }
}
