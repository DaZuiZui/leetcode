import java.util.Scanner;

public class LQC3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        long sum =0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            sum += arr[i];
        }
        long res =0;
        for (int i = 0; i < n; i++) {
            sum-=arr[i];
            res+=arr[i] *sum;
        }
        System.out.println(res);


        return;
    }
}
