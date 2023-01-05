import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P1803 {
    public static void main(String[] args) {
        System.out.println(new P1803().countPairs(new int[]{9,8,4,2,1}, 5, 14));
    }

    public int countPairs(int[] nums, int low, int high) {
        Arrays.sort(nums);
        int n = nums.length;
       int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long tmp = nums[i] ^ nums[j];
                if (tmp >= low && tmp <= high){
                    res++;
                }
            }
        }

        return  res;
    }
}
