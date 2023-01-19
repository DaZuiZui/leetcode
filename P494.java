package day5;

public class P494 {
    public static void main(String[] args) {

    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        //如果diff < 0 就代表 sum 比target小无法满足
        //如果diff % 2 == 1 就代表无法满足，因为想让L - R == target 那么就必须满足 diff % 2 == 0
        if (diff < 0 || diff % 2 != 0){
            return 0;
        }

        //获取最大容量
        int size = diff /2;

        int[] dp = new int[size+1];

        dp[0] = 1; //背包容量为0 有1种方法，就是不装
        //遍历物品
        for (int i = 0; i < nums.length; i++) {
            //遍历背包
            for (int j = size; j >= nums[i]; j--) {
                dp[j] = dp[j-nums[i]]+1;
            }
        }

        return dp[size];
    }
}
