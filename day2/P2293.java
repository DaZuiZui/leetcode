package day2;

public class P2293 {
    public static void main(String[] args) {

    }

    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n != 1){
            int curlength = 0;
            for (int i = 0; i < n; i+=2) {
                if ((curlength % 2) == 0){
                    nums[curlength] = Math.min(nums[i] , nums[i+1]);
                }else {
                    nums[curlength] = Math.max(nums[i] , nums[i+1]);
                }
                curlength++;
            }
            n = curlength;
        }

        return nums[0];
    }
}
