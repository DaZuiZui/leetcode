package leccod;

import java.util.Arrays;
import java.util.HashSet;

public class Offer61 {
    public static void main(String[] args) {

    }

    public boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = 14,max= 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) continue;
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            if (!set.add(nums[i])) return false;
        }

        return (max - min) < 5 ;
    }
}
