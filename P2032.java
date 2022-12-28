import java.util.*;

public class P2032 {
    public static void main(String[] args) {

    }

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> setres = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        //查看num3是否在num1和num2中存在
        for (int i : nums3) {
            if (set1.contains(i) || set2.contains(i)){
                setres.add(i);
            }
            set3.add(i);
        }

        List<Integer> res = new ArrayList<>();
        //查看num1是否在num2和num3存在
        for (int i : nums1) {
            if (set3.contains(i) || set2.contains(i)){
                setres.add(i);
            }
        }
        //查看num2是否在num1和num2中存在
        for (int i : nums2) {
            if (set1.contains(i) || set3.contains(i)){
                setres.add(i);
            }
        }
        res.addAll(setres);
        return res;
    }
}
