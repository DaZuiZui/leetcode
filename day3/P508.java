package day3;

public class P508 {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1)return 1;
        //1.dp数组的和下表的定义
        int[] dp = new int[n+1];
        dp[0] = 0 ;dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
