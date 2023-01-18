public class P1049 {
    public static void main(String[] args) {
        System.out.println(new P1049().lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1}));
    }

    public int lastStoneWeightII(int[] stones) {
        int sum =0 ;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum /2;
        int[] dp = new int[target+1];
        int n = stones.length;
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]] + stones[i]);
            }
        }

        return Math.max(sum - dp[target] - dp[target],dp[target]-(sum - dp[target] ));
    }
}
