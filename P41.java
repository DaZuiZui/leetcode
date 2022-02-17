package leccod;

import java.util.Arrays;
import java.util.HashMap;

public class P41 {
    public static void main(String[] args) {
        System.out.println(new P41().firstMissingPositive(new int[]{-1}));
    }

    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num1 = 0;
        boolean b = true;
        for (int num : nums) {
            if (num > 0){
                b = false;
            }
            map.put(num,0);
        }

        if (b){
            return 1;
        }

        Arrays.sort(nums);

        num1 = nums[nums.length-1] +1;

        for (int i = 1; i < nums[nums.length-1] ; i++) {
            if (!map.containsKey(i)){
                num1 =i;
                break;
            }
        }


        return num1;
    }
}
