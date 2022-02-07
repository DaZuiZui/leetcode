package leccod;

import java.util.ArrayList;
import java.util.Collections;

public class P283 {
    public static void main(String[] args) {
        new P283().moveZeroes(new int[]{0,1,0,3,12});
    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i  ; j < nums.length && nums[i] ==0; j++) {
                if (nums[j] !=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    count++;
                }
            }
        }
    }
}
