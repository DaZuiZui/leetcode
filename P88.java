package leccod;

import java.util.Arrays;

public class P88 {
    public static void main(String[] args) {
        new P88().merge(new int[]{1,2,3,0,0,0},3,
                new int[]{2,5,6},3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m,j = 0; i < nums1.length && j<n; i++,j++) {
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
    }
}
