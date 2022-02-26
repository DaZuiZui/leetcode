package leccod;

import java.util.HashMap;

public class P260 {
    public static void main(String[] args) {
        System.out.println(new P260().singleNumber(new int[]{1,2,1,3,2,5}));
    }

    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        int[] arr = new int[2];
        int inedx = 0;

        for (Integer integer : map.keySet()) {
            if (map.get(integer) == 1) {
                System.out.println(map.get(integer));
                arr[inedx++] = integer;
            }
        }

        return arr;
    }
}
