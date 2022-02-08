package leccod;

import java.util.Arrays;

public class P455 {
    public static void main(String[] args) {
        System.out.println(new P455().findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));
    }

    public int findContentChildren(int[] g, int[] s) {
        int count  = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0,j = 0  ; i < g.length;j++, i++) {
            while(j<s.length && s[j] < g[i]){
                j++;
            }

            if (j<s.length && s[j] >= g[i] ){
                count++;
            }
        }

        return count;
    }
}
