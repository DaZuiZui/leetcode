package leccod;

import java.util.ArrayList;
import java.util.List;

public class P2210 {
    public static void main(String[] args) {
        System.out.println(new P2210().countHillValley(new int[]{5,7,7,1,7}));
    }

    public int countHillValley(int[] nums) {
        int res = 0;
        List<Integer> list = new ArrayList<>();

        /**
         * 去重
         */
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if ( list.get(list.size()-1) != nums[i]) {
                list.add(nums[i]);
            }
        }

        System.out.println(list);

        for (int i = 1; i < list.size() -1; i++) {
            //判断是否峰
            if (list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1)) {
                res++;
            }

            //判断是否为谷
            if (list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)){
                res++;
            }
        }

        return res;
    }
}
