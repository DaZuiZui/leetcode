package ZhijianOffer;

import java.util.Scanner;

public class Lancup4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) <= str.charAt(i-1)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
