package leccod;

import java.util.Arrays;
import java.util.HashSet;

public class P16 {
    public static void main(String[] args) {
        int[] a = {1,2,4,8,16,32,64,128};
        System.out.println(new P16().threeSumClosest(a, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int returnInt  = nums[1]+nums[2]+nums[0];


        for (int i = 0; i < nums.length; i++) {
            //确保l < r
            int l = i+1;
            int r = nums.length -1;

            while (l < r){
                if ( Math.abs(nums[i]+nums[r]+nums[l] -target) < Math.abs(returnInt-target)){
                    returnInt=nums[i]+nums[r]+nums[l];
                }



                if (nums[i]+nums[r]+nums[l] < target){
                    l++;
                }else if (nums[i]+nums[r]+nums[l] > target){
                    r--;
                }else{

                        return target;

                }
            }
        }

        return returnInt;
    }
}
