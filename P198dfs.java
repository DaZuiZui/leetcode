package leccod;

import java.util.Arrays;

public class P198dfs {
    public static void main(String[] args) {
        System.out.println(new P198dfs().rob(new int[]{2,1,1,2}));
    }


    public int rob(int[] nums) {
        int[] jy = new int[nums.length];
        Arrays.fill(jy, -1);
        return dfs(nums, 0,jy);
    }

    private int dfs(int[] nums, int i,int[] jy) {
        if (i >= nums.length) return 0;

        if (jy[i] != -1)
            return jy[i];

         int butou = dfs(nums, i + 1,jy) +0;
         int tou = dfs(nums, i + 2,jy) + nums[i];
        jy[i] = Math.max(tou, butou);

         return  jy[i];
    }
}
