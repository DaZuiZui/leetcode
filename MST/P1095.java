package mst;

import java.util.Scanner;

public class P1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String str = scanner.next();
            str = check(str);
            String str1 = scanner.next();
            str1 = check(str1);
            if (str.equals(str1)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static String check(String str){
        int n = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        while (
                stringBuilder.indexOf("m") != -1 &&
                stringBuilder.indexOf("h") != -1 &&
                stringBuilder.indexOf("y") != -1
        ){
            stringBuilder =
                    stringBuilder.delete(stringBuilder.indexOf("m"),stringBuilder.indexOf("m")+1)
                    .delete(stringBuilder.indexOf("h"),stringBuilder.indexOf("h")+1)
                    .delete(stringBuilder.indexOf("y"),stringBuilder.indexOf("y")+1);
        }

        return stringBuilder.toString();
    }
}
