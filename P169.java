package leccod;

import java.util.Arrays;

public class P169 {
    public static void main(String[] args) {
        System.out.println(new P169().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int zj = nums.length/2;
        Arrays.sort(nums);
        int len = 1;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1]){
                len++;
            }else{
                len = 1;
            }

            if (len > zj){
                return nums[i];
            }
        }

        return 0;
    }
}
