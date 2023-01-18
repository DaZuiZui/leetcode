

public class P416 {
    public static void main(String[] args) {

    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum+=num;
            max = Math.max(max,num);
        }
        if(sum % 2 != 0) return false;
        int target = sum/2;

        int[] dp = new int[target+1];

        for (int i = 0; i < n; i++) {
            for (int j = target; j >= nums[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-nums[i]] + nums[i]);
            }
        }

        return dp[target] == target;
    }
}
