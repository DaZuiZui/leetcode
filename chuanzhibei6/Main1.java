package chuanzhibei6;

import java.util.Scanner;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int zl = scanner.nextInt();
            Integer cha1 = Integer.MAX_VALUE;
            Integer cha2 = Integer.MAX_VALUE;
            //否则获取上下比较接近的
            if (set.size() >= 1){
                Integer floor = set.floor(zl);
                Integer ceiling = set.ceiling(zl);
                if (floor != null) {
                     cha1 = Math.abs(floor - zl);
                }
                if (ceiling != null) {
                     cha2 = Math.abs(zl - ceiling);
                }
                res = Math.min(res, Math.min(cha1, cha2));
            }
            set.add(zl);


        }


        System.out.println(res);
    }
}
