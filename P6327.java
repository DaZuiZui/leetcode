import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6327 {
    public static void main(String[] args) {
        System.out.println(new P6327().minNumber(new int[]{4, 1, 3}, new int[]{5,7}));
    }

    public int minNumber(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int res = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            list.add(i);
        }
        list.sort(null);

        Arrays.sort(nums2);
        for (int i : nums2) {
            if (list.contains(i)) {
                return i;
            }
        }

        if (list.get(0) > nums2[0]){
            return Integer.valueOf(nums2[0] + ""+list.get(0));
        }

        return Integer.valueOf(list.get(0) +""+ nums2[0]);
    }
}
