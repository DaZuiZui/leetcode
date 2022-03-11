package leccod;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;

public class Offer39 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int mid = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer) > mid){
                return integer;
            }
        }

        return -1;
    }

}
