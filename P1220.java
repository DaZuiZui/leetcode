package leccod;

import java.util.ArrayList;

public class P1220 {
    public static void main(String[] args) {
        System.out.println(new P1220().countVowelPermutation(2));
    }

    public int countVowelPermutation(int n) {
        long mod = 10*10*10*10*10*10*10*10*10 +7;
        /**
         * 0代表a 1代表e .....
         */
        long[] dp     = new long[5];
        long[] dptemp = new long[5];

        //初始化每个元音结尾的出现个数
        for (int i = 0; i < 5; i++)
            dp[i] = 1;

        /**
         * 核心思路:
         *      记录每个元音结尾可以组成的次数
         *      比如a元音结尾，那么就将 a前面所有字母为结尾的次数加起来
         *      如 n==1时候
         *          e 出现了1次
         *          i 出现了1次
         *          o 出现了1次
         *      那么 n==2的时候
         *          a结尾的单词就是 1+1+1 3次
         */
        for (int i = 2; i <= n; i++) {
            //a的前面有 u i e
            dptemp[0] = (dp[1] + dp[2] + dp[4]) % mod;
            //e前面可以出现的 i a
            dptemp[1] = (dp[0] + dp[2]) % mod;
            //i前面可以出现的单词
            dptemp[2] = (dp[1] + dp[3]) % mod;
            //o
            dptemp[3] = (dp[2]) % mod;
            //u
            dptemp[4] = (dp[2] + dp[3]) % mod;

            //将dptemp赋值给dp
            dp[0] = dptemp[0];
            dp[1] = dptemp[1];
            dp[2] = dptemp[2];
            dp[3] = dptemp[3];
            dp[4] = dptemp[4];
        }

        long sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = (dp[i] + sum ) % mod;
        }

        return (int)sum;
    }

}
