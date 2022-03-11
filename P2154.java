package leccod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P2154 {
    public static void main(String[] args) {
        System.out.println(new P2154().findFinalValue(new int[]{5, 3, 6, 1, 12}, 3));
    }

    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        while(set.contains(original)){
            original*=2;
        }

        return original;
    }
}
