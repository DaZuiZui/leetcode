package leccod;

import java.util.Arrays;

public class P628 {
    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],
                nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]
                );
    }
}
