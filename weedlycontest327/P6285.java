package weedlycontest327;

import java.util.PriorityQueue;

public class P6285 {
    public static void main(String[] args) {
        System.out.println(new P6285().maxKelements(new int[]{1, 10, 3, 3, 3}, 3));
    }

    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for (int num : nums) {
            queue.offer(num);
        }
        long res = 0;

        for (int i = 0; i < k; i++) {
            Integer poll = queue.poll();
            res+= poll;
            double tmp = poll *1.0 /3;
            queue.offer((int) Math.ceil(tmp));
            //queue.offer(poll);
        }

        return res;
    }
}
