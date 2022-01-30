package leccod;

public class P10OfferII {
    public static void main(String[] args) {
        System.out.println(new P10OfferII().numWays(7));
    }

    public int numWays(int n) {
        if (n == 1){
            return 2;
        }else if (n == 0){
            return 1;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }

        return dp[n-1];
    }
}
