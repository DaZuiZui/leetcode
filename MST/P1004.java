package mst;

import java.util.Scanner;

public class P1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        if (sum %2 == 1) {
            System.out.println(0);
            return;
        }

        int mid = (int) (sum/2);
        long[] dp = new long[mid+1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = mid; j >= a[i] ; j--) {
                dp[j] = dp[j] += dp[(int) (j - a[i])];
            }
        }

        System.out.println(dp[mid]);
    }
}
