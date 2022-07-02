import java.util.Arrays;

public class OfferII091 {
    public static void main(String[] args) {

    }

    public int minCost(int[][] costs) {
        int[] dp = new int[3];
        for (int i = 0; i < 3; i++) {
            dp[i] = costs[0][i];
        }

        for (int i = 1; i < costs.length; i++) {
            int[] newdp = new int[3];
            for (int j = 0; j < 3; j++) {
                newdp[j] = Math.min(
                        dp[(j+1)%3],
                        dp[(j+2)%3]) + costs[i][j];
            }

            dp = newdp;
        }

        return Arrays.stream(dp).min().getAsInt();
    }
}
