package leccod;

import java.util.*;

public class P2215 {
    public static void main(String[] args) {
        new P2215().findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2});
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        //HashMap<Integer,Integer> map1 = new HashMap<>();
        //HashMap<Integer,Integer> map2 = new HashMap<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        //筛选nums2
        for (int i : nums2) {
            if (!set1.contains(i) && !list1.contains(i) ) {
                list1.add(i);
            }
            set2.add(i);
        }



        //筛选nums1
        for (int i : nums1) {
            if (!set2.contains(i) && !list2.contains(i)) {
                list2.add(i);
            }
        }
        list.add(new ArrayList<>(list2));
        list.add(new ArrayList<>(list1));

        return list;
    }
}
