package leccod;

import java.util.Arrays;

public class P33 {
    public static void main(String[] args) {
        System.out.println(new P33().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }

}
