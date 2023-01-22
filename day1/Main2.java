package lancup.day1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double ave = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            max = Math.max(max,num);
            min = Math.min(min,num);
            sum += num;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",(sum*1.0)/n);
    }
}
