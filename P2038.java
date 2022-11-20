import java.util.Arrays;
import java.util.TreeSet;

public class P2038 {
    public static void main(String[] args) {
        int[] averages = new P2038().getAverages(new int[]{100000}, 0);
        for (int average : averages) {
            System.out.println(average);
        }

    }

    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long[] arr = new long[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i]  = arr[i-1] + nums[i];
        }
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for (int i = 0; i < n - k; i++) {
            if (i < k){
                continue;
            }

            long cha = i <= k ? 0 : arr[i - k - 1];
            res[i] = (int) ((arr[i+k] - cha )/ ((k*2)+1));
        }


        return res;
    }
}
