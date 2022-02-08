package leccod;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P485 {
    public static void main(String[] args) {
        System.out.println(new P485().findMaxConsecutiveOnes(new int[]{1,1,0,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0 ; i< nums.length ;i++){
            if (nums[i] != 0){
                dp[i] = i-1 >= 0 && nums[i-1] > 0 ?  dp[i-1] + 1 : 1;
                System.err.println(dp[i]);
            }
        }

        for (int i : dp) {
            //System.out.println(i);
        }


        Arrays.sort(dp);

        return dp[dp.length-1];
    }
}
