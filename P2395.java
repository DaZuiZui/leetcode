import java.util.HashSet;
import java.util.Set;

public class P2395 {
    public static void main(String[] args) {

    }


    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (!set.add(nums[i] + nums[i+1])) {
                return true;
            }
        }

        return false;
    }
}
