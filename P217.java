package leccod;

import java.util.Arrays;

public class P217 {
    public static void main(String[] args) {
        System.out.println(new P217().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                len++;
            }else{
                len = 1;
            }

            if (len >=2){
                return true;
            }
        }
        return false;
    }
}
