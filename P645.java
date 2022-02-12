package leccod;

import lancup.lancup2021.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class P645 {
    public static void main(String[] args) {
        new P645().findErrorNums(new int[]{
                2,2});
    }

    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],0);
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 0) {
                    arr[0] = i;
                }
            }else{
                arr[1] = i;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

        return arr;
    }
}
