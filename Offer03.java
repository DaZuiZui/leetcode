package leccod;

import java.util.Arrays;

public class Offer03 {
    public static void main(String[] args) {

    }

    public int findRepeatNumber(int[] nums) {
        if (nums.length < 1){
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                return nums[i];
            }
        }

        return 0;
    }
}
