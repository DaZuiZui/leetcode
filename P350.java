package leccod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class P350 {
    public static void main(String[] args) {
        System.out.println(new P350().intersect(new int[]{3,1,2}, new int[]{1,1}));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap();
        ArrayList<Integer> list = new ArrayList();
        int[] arr = null;

        if (nums1.length > nums2.length){
            for (Integer num : nums1){
                if (map.containsKey(num)) {
                    map.put(num,map.get(num) +1);
                }else{
                    map.put(num,1);
                }
            }
            arr= nums2;
        }else{
            for (Integer num : nums2){
                if (map.containsKey(num)) {
                    map.put(num,map.get(num) +1);
                }else{
                    map.put(num,1);
                }
            }
            arr= nums1;
        }

        for (int i : arr) {
            if (map.containsKey(i)){
                if (map.get(i) > 0){
                    map.put(i,map.get(i) -1);
                    list.add(i);
                }else{
                    map.remove(i);
                }
            }
        }

        int[] arr1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr1[i] = list.get(i);
            System.out.println(arr[i]);
        }


        return arr1;
    }
}
