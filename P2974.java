import java.util.Arrays;
import java.util.PriorityQueue;

public class P2974 {
    public static void main(String[] args) {

    }

    public int[] numberGame(int[] nums) {
        int n = nums.length;;
        int[] res = new int[n];
        Arrays.sort(nums);

        for (int i = 0; i < n-1; i+=2) {
            res[i] = nums[i+1];
            res[i+1] = nums[i];
        }

        return res;
    }
}
