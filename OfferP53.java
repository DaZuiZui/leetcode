package leccod;

import java.util.HashMap;

public class OfferP53 {
    public static void main(String[] args) {
        System.out.println(new OfferP53().search(new int[]{5,7,7,8,8,10}, 6));
    }

    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length && nums[i] <= target; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        return map.containsKey(target) ?  map.get(target) : 0 ;
    }
}
