package leccod;

public class P221 {
    public static void main(String[] args) {

    }

    public int maximalSquare(char[][] matrix) {
        int sidelength =0;
        int[][] dp =  new int[matrix.length][matrix[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (matrix[i][j] == 1){
                    if (i == 0 || j==0){
                        dp[i][j] =1;
                    }else{
                        dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i][j-1]),dp[i-1][j]);
                    }

                    sidelength = Math.max(sidelength,dp[i][j]);
                }
            }
        }

        return sidelength*sidelength;
    }
}
