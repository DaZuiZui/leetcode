import java.util.Arrays;
import java.util.Scanner;

public class P1979 {
    public static void main(String[] args) {
        new P1979().findGCD(new int[]{2,5,6,9,10});
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        int res = 1;
        for (int i = 1; i < max; i++) {
            if (min % i == 0 && max % i == 0){
                res = Math.max(res,i);
            }
        }

        return res;
    }
}
