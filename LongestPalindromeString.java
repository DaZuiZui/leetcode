public class LongestPalindromeString {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromeString().longestPalindromeSubseq("bbbab"));
    }

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int res = 0;
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i <= 1){
                        dp[i][j] = true;
                        res = Math.max(res,j-i+1);
                    }else{
                        dp[i][j] = dp[i+1][j-1];
                        if (dp[i][j]){
                            res = Math.max(j-i+1,res);
                        }
                    }
                }
            }
        }

        return res;
    }
}
