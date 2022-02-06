package leccod;

import java.util.Arrays;

public class P268 {
    public static void main(String[] args) {
        System.out.println(new P268().missingNumber(new int[]{0,1,2,3,4}));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1] -1){
                return nums[i] +1;
            }
        }

        return nums[0] > 0 ? nums[0] -1 : nums[nums.length -1 ] +1;
    }
}
