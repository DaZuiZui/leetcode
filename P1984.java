package leccod;

import java.util.Arrays;

public class P1984 {
    public static void main(String[] args) {

    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i+k-1 < nums.length; i++) {
            res = Math.min(res,nums[i+k-1] - nums[i]);
        }
        return res;
    }
}
