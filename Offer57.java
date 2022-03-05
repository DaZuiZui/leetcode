package leccod;

import java.util.HashMap;
import java.util.HashSet;

public class Offer57 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(target-num)){
                return new int[]{num,target-num};
            }else{
                set.add(num);
            }
        }
        return null;
    }
}
