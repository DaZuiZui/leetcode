import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P347 {
    public static void main(String[] args) {
        System.out.println(new P347().topKFrequent(new int[]{3,0,1,0}, 1));
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->{
            return map.get(b) - map.get(a);
        });
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            queue.offer(mp.getKey());
        }
 
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }

        return res;
    }
}
