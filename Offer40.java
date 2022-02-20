package leccod;

import java.util.Arrays;

public class Offer40 {
    public static void main(String[] args) {
        new Offer40().getLeastNumbers(new int[]{3,2,1,0},2);
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] nums = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        for (int num : nums) {
            System.out.println(num);
        }
        return nums;
    }
}
