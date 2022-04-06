package leccod;

import java.util.Arrays;
import java.util.HashMap;

public class P747 {
    public static void main(String[] args) {
        System.out.println(new P747().dominantIndex(new int[]{1,2,3,4}));
    }

    public int dominantIndex(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],nums[i]*2);
            map1.put(nums[i],i);
        }

        Arrays.sort(nums);

        int res = -1;

        if (nums[nums.length-1] >= map.get(nums[nums.length-2])){
            res = map1.get(nums[nums.length-1]);
        }

        
        return res;
    }
}
