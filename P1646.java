package leccod;

import java.util.Arrays;

public class P1646 {
    public static void main(String[] args) {
        System.out.println(new P1646().getMaximumGenerated(4));
    }

    public int getMaximumGenerated(int n) {
        if (n <= 0){
            return 0;
        }else if (n <= 2){
            return 1;
        }else if(n ==3){
            return 2;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;dp[1] =1;dp[2]= 1; dp[3]=2;
        for (int i = 2; i <= n && i*2 < dp.length && i*2+1 < dp.length; i++) {
            dp[2*i] = dp[i];
            dp[2*i+1] = dp[i]+dp[i+1];
        }
        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
