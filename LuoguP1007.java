import java.util.Arrays;
import java.util.Scanner;

public class LuoguP1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int[] location = new int[n];

        int min = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < location.length; i++) {
            int num  = scanner.nextInt();
            location[i] = num;
            min = Math.max(min,Math.min(num,l+1-num));
            max = Math.max(max,Math.max(num,l+1-num));
        }


        System.out.println(min+" "+max);
    }
}
