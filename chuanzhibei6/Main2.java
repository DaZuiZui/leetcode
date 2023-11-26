package chuanzhibei6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        String str = scanner.next();
        long res =0;

        long dp1[] = new long[26];
        long dp2[] = new long[26];

        for (int i = 0; i < n; i++) {
            res+= dp2[str.charAt(i)-'a'];
            dp2[str.charAt(i)-'a']+=i-dp1[str.charAt(i)-'a'];
            ++dp1[str.charAt(i)-'a'];
        }

        System.out.println(res);
    }
}
