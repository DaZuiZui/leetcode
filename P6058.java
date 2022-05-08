package leccod;

import java.util.HashMap;

public class P6058 {
    //"355577777788899"
    public static void main(String[] args) {
        System.out.println((int)1e5);
        new P6058().countTexts("123");
    }
    static int N   = 100001;
    static int MOD = (int) 1e9 + 7;
    static long[] three = new long[N];
    static long[] four = new long[N];
    static{
        three[0] = 1;
        three[1] = 1;
        three[2] = 2;
        three[3] = 4;
        four[0] = 1;
        four[1] = 1;
        four[2] = 2;
        four[3] = 4;

        for (int i = 4; i < N; i++) {
            three[i] = three[i-3] + three[i-1] + three[i-2];
            three[i] %= MOD;
            four[i]  = four[i-3]  + four[i-1]  + four[i-2] + four[i-4];
            four[i] %= MOD;
        }
    }

    public int countTexts(String pressedKeys) {
        long res = 1;
        char[] cs = pressedKeys.toCharArray();
        for (int i = 0; i < pressedKeys.length(); ) {
            int j = i;
            while (j+1 < pressedKeys.length() && cs[j] == cs[j+1]){
                j++;
            }
            boolean isFour = cs[i] == '7' | cs[i] == '9';
            long cur = isFour ? four[j - i + 1] : three[j - i + 1];
            res = (res*cur)%MOD;
            i=j+1;
        }
        return (int) res;
    }


}
