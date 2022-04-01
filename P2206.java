package leccod;

import java.util.HashMap;

public class P2206 {
    public static void main(String[] args) {

    }

    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Integer value : map.values()) {
            if (value %2 != 0){
                return false;
            }
        }

        return true;
    }
}
