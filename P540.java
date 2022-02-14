package leccod;

import java.util.Arrays;

public class P540 {
    public static void main(String[] args) {
        System.out.println(new P540().singleNonDuplicate(new int[]{1, 1, 2,2, 3, 3,4,4,5,5,6}));
    }

    public int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]){
                i++;
            }else{
                return nums[i-1];
            }
        }

        return nums[nums.length-1];
    }
}
