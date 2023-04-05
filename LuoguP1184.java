import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LuoguP1184 {
    public static long res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int[] dp = new int[m+1];

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 0 ; j--) {
                if (j >= arr[i-1][0]){
                    dp[j] = Math.max(dp[j-arr[i-1][0]]+arr[i-1][1],dp[j]);
                }
            }
        }

        System.out.println(dp[m]);
    }
}
