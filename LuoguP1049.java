import java.util.Scanner;

public class LuoguP1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] dp = new int[m+1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 0 ; j--) {
                if (j >= arr[i-1]){
                    dp[j] = Math.max(dp[j],dp[j-arr[i-1]]+arr[i-1]);
                }
            }
        }

        System.out.println(m - dp[m]);
    }
}
