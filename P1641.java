package leccod;

public class P1641 {
    public static void main(String[] args) {
        System.out.println(new P1641().countVowelStrings(3));
    }

    public int countVowelStrings(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 5;
        }

        int[][] dp = new int[n][5];
        for (int i = 0 ; i < 5 ; i++){
            dp[0][i] = 1;
        }
        int sum = 5;
        int returnint = 0;

        for (int i = 1 ; i < n ;i++){
            dp[i][0] = sum;
            //System.out.println(dp[i][0]);
            sum = dp[i][0];
            for (int j = 1; j < 5; j++) {
                dp[i][j] = dp[i][j-1] - dp[i-1][j-1];
                sum+=dp[i][j];
            }
        }

        for (int i = 0; i < 5; i++) {
            returnint += dp[n - 1][i];
        }

        return returnint;
    }
}
