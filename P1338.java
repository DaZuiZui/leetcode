import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P1338 {
    public static void main(String[] args) {

    }

    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->{
            return map.get(b) - map.get(a);
        });
        queue.addAll(map.keySet());
        int sum =0;
        while (sum < arr.length/2){
            sum+= map.get(queue.poll());
            res++;
        }


        return res;
    }
}
