package day1;

import java.util.Scanner;

public class LuoguP1765 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println(str);
        int[] arr = new int[]{1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
        int res = 0;

        for (char c : str.toCharArray()) {
            if (c == ' '){
                res++;
            }else {
                //System.out.println(arr[c - 'a']);
                res += arr[c-'a'];
            }
        }
        System.out.println(res);
    }
}
