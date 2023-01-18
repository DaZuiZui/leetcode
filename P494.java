public class P494 {
    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum < target){
            return 0;
        }else if (target < 0 && sum < -target){
            return 0;
        }
        if ((sum+target)% 2!= 0){
            return 0;
        }

        int size = (sum+target)/2;
        if(size < 0) size = -size;
        int[] dp = new int[size+1];
        dp[0] =1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[size];
    }
}
