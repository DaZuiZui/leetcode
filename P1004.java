package leccod;

public class P1004 {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int count =0;

        for (int r = 0,l=0 ; r < nums.length; r++) {
            count += nums[r] == 0 ? 1 :0;
            if (count > k){
                count -= nums[l++] == 0? 1: 0;
            }
            res = Math.max(res,r-l+1);
        }

        return res;
    }

}
