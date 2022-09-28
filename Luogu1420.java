import java.util.Scanner;

public class Luogu1420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1] + 1){
                dp[i] = dp[i-1]+1;
                res = Math.max(dp[i],res);
            }else{
                dp[i] =1;
            }
        }

        System.out.println(res);
    }
}
