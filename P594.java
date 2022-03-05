package leccod;

import java.util.HashMap;

public class P594 {
    public static void main(String[] args) {
        new P594().findLHS(new int[]{1,3,2,2,5,2,3,7});
    }

    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        
        int res = 0;
        for (int num : nums) {
            if (map.containsKey(num-1)) {
                res = Math.max(res,map.get(num-1)+map.get(num));
            }
        }
        return res;
    }
}
