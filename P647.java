public class P647 {
    public static void main(String[] args) {

    }

    public int countSubstrings(String s) {
        int res =0;
        int length = s.length();
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int j = 0;j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if(s.charAt(i) != s.charAt(j)){
                    continue;
                }
                dp[i][j] = j - i <3 || dp[i+1][j-1];
                if (dp[i][j]) {
                    res++;
                }
            }
        }

        return res;
    }
}
