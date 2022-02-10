package leccod;

import java.util.Arrays;

public class P581 {
    public static void main(String[] args) {
        System.out.println(new P581().findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
    }

    public int findUnsortedSubarray(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);

        //遍历数组
        for (int i = 0; i < nums.length; i++) {

            //判断下标是否一致
            if (nums[i] != arr[l]){
                break;
            }
            l++;
        }

        for (int i = nums.length-1 ; i >= 0 ; i--) {
            if (nums[i] != arr[r]){
                break;
            }
            r--;
        }

        if (r == l || r< l){
            return 0;
        }

        return r-l+1;
    }
}
