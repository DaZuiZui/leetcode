package day3;

import java.util.Arrays;

public class P455 {
    public static void main(String[] args) {
        System.out.println(new P455().findContentChildren(new int[]{1, 2}
                , new int[]{1, 2,3}));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res =0 ;
        int start = 0;
        int index =0 ;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]){
                res++;
                start++;
            }
        }

        return res;
    }
}
