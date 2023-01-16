package day3;

public class P53 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int res = 0;
        int count =0;
        int n = nums.length;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            count += nums[i];
            sum = Math.max(count,sum);
            if (count <= 0){
                count= 0;
            }
        }
        return sum;
    }
}
