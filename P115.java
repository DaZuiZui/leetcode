public class P115 {
    public static void main(String[] args) {

    }

    public int numDistinct(String s, String t) {
        int res = 0;
        int sl = s.length();
        int tl = t.length();
        int[][] dp = new int[sl+1][tl+1];

        for (int i = 0; i < sl; i++) {
            dp[i][0]=1;
        }

        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= tl; j++) {
                if (s.charAt(i) == t.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[sl][tl];
    }
}
