package lancup.day1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if (tmp >= 85){
                a++;
                b++;
            } else if (tmp >= 60){
                a++;
            }
        }

        double offer = a*1.0 / n;
        System.out.printf("%.0f",offer*100);
        System.out.println("%");
        double nice = b*1.0/n;
        System.out.printf("%.0f",nice*100);
        System.out.println("%");
    }
}
