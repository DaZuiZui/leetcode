package leccod;

import java.util.HashMap;
import java.util.Map;

public class P3003 {
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int max = 0;
            int res = 0;
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                int tmp = map.get(num);
                max = Math.max(max,tmp);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() == max) {
                    res+=entry.getValue().intValue();
                }
            }
            return res;
        }
    }
}
