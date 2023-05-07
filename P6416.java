import java.util.HashSet;
import java.util.Set;

public class P6416 {
    public static void main(String[] args) {

    }

    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            res[i] = set.size();
        }

        set.clear();
        for (int i = n-1; i >= 0 ; i++) {
            set.add(nums[i]);
            if ( i > 0 ){
                res[i-1] -= set.size();
            }
        }
        return res;
    }
}
