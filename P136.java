package leccod;

import java.util.Arrays;
import java.util.HashMap;

public class P136 {
    public static void main(String[] args) {
        System.out.println(new P136().singleNumber(new int[]{2,1,2}));
    }



    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int returnInt = 0;

        for (int i = 0 ; i < nums.length ;){
            if ((i+1) < nums.length && nums[i] == nums[i+1]){
                i+=2;
                continue;
            }
            returnInt = nums[i];
            i++;
        }

        return returnInt;
    }
}
