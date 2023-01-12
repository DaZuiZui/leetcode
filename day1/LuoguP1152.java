package day1;

import java.util.Scanner;

public class LuoguP1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] arr = new int[n];
        boolean[] vis = new boolean[n];
        vis[0] = true;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (i > 0){
                long tmp = Math.abs(arr[i] - arr[i-1]);
                //System.out.println(tmp);
                if (tmp >= 1 && tmp <= n - 1){
                    vis[i] = true;
                }
            }
        }

        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == false){
                System.out.println("Not jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }
}
