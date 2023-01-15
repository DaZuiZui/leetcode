package weedlycontest328;

import java.util.HashMap;

public class P3 {
    public static void main(String[] args) {
        System.out.println(new P3().countGood(new int[]{3,1,4,3,2,2,4}, 2));
    }

    public long countGood(int[] nums, int k) {
        long res = 0;
        int n = nums.length;
        long count = 0;
        //counts
        HashMap<Integer,Integer>  counts = new HashMap<>();
        for (int l = 0,r =0; l <= r  && l < n; l++) {
            while (r < n && count < k){
                int num = nums[r];
                int pair = counts.getOrDefault(num,0);
                count += pair;
                counts.put(num,pair+1);
                r++;
            }

            if (count >= k){
                res += n - r + 1;
            }

            int lnum = nums[l];
            counts.put(lnum,counts.get(lnum) -1);
            count -= counts.get(lnum);
        }

        return res;
    }
}
