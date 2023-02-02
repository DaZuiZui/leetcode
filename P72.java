public class P72 {
    public static void main(String[] args) {

    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        //定义 以word i-1 结尾 和word j-1结尾相同的的最少操作数量
        int[][] dp = new int[n+1][m+1];
        //初始化
        for (int i = 0; i <= n ; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i <= m ; i++) {
            dp[0][i] =i;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m ; j++) {
                if (word1.charAt(i) == word1.charAt(j)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(
                            dp[i-1][j]+1,
                            Math.min(
                                    dp[i][j-1] +1,
                                    dp[i-1][j-1] +1
                            )
                    );
                }
            }
        }

        return dp[n][m];
    }
}
