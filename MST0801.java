package leccod;

public class MST0801 {
    public static void main(String[] args) {
        System.out.println(new MST0801().waysToStep(1000000));
    }

    public int waysToStep(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= n; i++) {
            dp[i] = ((dp[i-1]+dp[i-2]+dp[i-3]) % 1000000007);
        }
        return dp[n] % 1000000007;
    }
}
