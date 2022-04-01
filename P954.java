package leccod;

import lancup.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P954 {
    public static void main(String[] args) {
        System.out.println(new P954().canReorderDoubled(new int[]{4,-2,2,-4}));
    }

    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if (i < 0){
                if (map.containsKey(i*2) && map.get(i*2) != 0){
                    map.put(i*2,map.get(i*2) -1);
                }else{
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }else{
                if (map.containsKey(i) && map.get(i) !=0){
                    map.put(i,map.get(i) -1);
                }else{
                    map.put(i*2,map.getOrDefault(i*2,0)+1);
                }
            }
        }

        for (Integer value : map.values()) {
            if (value != 0){
                return false;
            }
        }
        return true;
    }
}
