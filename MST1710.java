package leccod;

import java.util.HashMap;

public class MST1710 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int mid = nums.length/2;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer) > mid){
                return map.get(integer);
            }
        }

        return -1;
    }
}
