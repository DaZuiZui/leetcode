package leccod;

import java.util.Arrays;

public class P213dfs {
    public static void main(String[] args) {
        System.out.println(new P213dfs().rob(new int[]{2,3,2}));
    }


    public int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        int[] jy = new int[nums.length];
        Arrays.fill(jy, -1);
        int[] arr0= new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            arr0[i] = nums[i];
        }
        int num1 = dfs(arr0, 0, jy);



        int[] arr= new int[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            arr[i-1] = nums[i];
        }
        Arrays.fill(jy, -1);
        int num2 = dfs(arr, 0, jy);
        return Math.max(num1,num2);
    }

    private int dfs(int[] nums, int i,int[] jy) {
        if (i >= nums.length) return 0;

        if (jy[i] != -1){
            if (i == 0) {
                return 0;
            }
            return jy[i];
        }

        int butou = dfs(nums, i + 1,jy) +0;
        int tou = dfs(nums, i + 2,jy) + nums[i];
        jy[i] = Math.max(tou, butou);

        return  jy[i];
    }
}
