package cf;

import java.util.Scanner;

/**
 * https://codeforces.com/gym/104353/problem/D
 */
public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] arr = new char[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            for (char c : str.toString().toCharArray()) {
                if (c == '@'){
                    count++;
                }
            }
        }

        System.out.println(count/2);
    }
}
