package leccod;

import java.util.Arrays;

public class P089Offer {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int[] jy = new int[nums.length];
        Arrays.fill(jy,-1);
        return help(nums,0,jy);
    }

    public int help(int[] nums,int index,int[] jy){
        if (nums.length <= index){
            return 0;
        }

        if (jy[index] != -1){
            return jy[index];
        }

        int butou = help(nums, index+1, jy) +0;
        int tou = help(nums, index+2, jy) + nums[index];

        jy[index] = Math.max(tou,butou);

        return jy[index];
    }
}
