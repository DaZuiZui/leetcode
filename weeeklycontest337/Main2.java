package weeeklycontest337;

import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(2,1);
        System.out.println(treeMap.floorEntry(2));
        System.out.println(new Main2().maximizeGreatness(new int[]{65,84,91,18,59,27,9,81,33,17}));
    }

    public int maximizeGreatness(int[] nums) {
        int n = nums.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> tmp = map.ceilingEntry((nums[i]+1));
            if (tmp == null){
                map.put(nums[i],map.get(nums[i])-1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
                continue;
            }
            if (tmp.getValue() < 1) continue;
            if (tmp != null){
                count++;
            }

            map.put(nums[i],map.get(nums[i])-1);
            if (map.get(nums[i]) == 0) map.remove(nums[i]);
        }

        return count;
    }
}
