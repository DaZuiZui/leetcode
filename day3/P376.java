package day3;

public class P376 {
    public static void main(String[] args) {
        System.out.println(new P376().wiggleMaxLength(new int[]{0,4}));
    }

    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return 1;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = dp[0][1] =1;
        //0 is up
        //1 is down
        for (int i = 1; i < n; i++) {
            //升序
            if (nums[i] > nums[i-1]){
                dp[i][0] = dp[i-1][1]+1;
                dp[i][1] = dp[i-1][1];
            }
            //降序
            else if (nums[i] < nums[i-1]){
                dp[i][0] =  dp[i-1][0];
                dp[i][1] = dp[i-1][0]+1;
            }else{
                dp[i][0] = dp[i-1][0];
                dp[i][1] = dp[i-1][1];
            }
        }


        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
