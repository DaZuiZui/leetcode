package leccod;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P1748 {
    public static void main(String[] args) {
        System.out.println(new P1748().sumOfUnique(new int[]{1, 2, 3, 2,2,2}));
    }

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int last = -1;
        for (int i = 0; i < nums.length; ) {
            if (last == nums[i]){
                i++;
                continue;
            }

            if (i < nums.length-1 &&nums[i] == nums[i+1]){
                last = nums[i];
                i+=2;
                continue;
            }
            sum+=nums[i];
            i++;
        }

        return sum;
    }
}
