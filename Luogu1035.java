import java.util.Scanner;

public class Luogu1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        // k is 1

        int n =1;
        double sum =0;
        while (true){
            sum += 1 * 1.0 / n;
            if (sum > k){
                System.out.println(n);
                return;
            }
            n++;
        }

    }
}
