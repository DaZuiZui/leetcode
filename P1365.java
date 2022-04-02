package leccod;

import java.util.ArrayList;
import java.util.List;

public class P1365 {
    public static void main(String[] args) {
        new P1365().smallerNumbersThanCurrent(new int[]{1,3,4});
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr= new int[nums.length];
        for (int num : nums) {
            list.add(num);
        }

        list.sort(null);

        for (int i = 0; i < nums.length; i++) {
            arr[i] = list.indexOf(nums[i])+1;
        }

        return arr;
    }
}
