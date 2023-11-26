package chuanzhibei6;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // boolean b = true; // true is xiao hong
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //推导出来 小红赢 a & 1 && b & 1

        int a1 = a & 1;
        int b1 = b & 1;
        int xiaohong = a1 & b1;
        if (xiaohong == 1){
            System.out.println("akai");
            return;
        }

        System.out.println("yukari");
    }
}
