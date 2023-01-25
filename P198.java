public class P198 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (nums.length == 0){
            return 0;
        }else if (nums.length == 1){
            return nums[0];
        }else if(n ==2){
            return Math.max(nums[0],nums[1]);
        }


        return Math.max(subrob(nums,1,n),subrob(nums,0,n-1));
    }

    public int subrob(int[] nums,int start,int end) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start],nums[start+1]);

        for (int i = start+2; i < end; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        return dp[end-1];
    }
}
