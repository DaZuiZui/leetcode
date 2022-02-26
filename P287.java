package leccod;

import java.util.Arrays;

public class P287 {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]){
                return nums[i];
            }
        }
        return 0;
    }
}
