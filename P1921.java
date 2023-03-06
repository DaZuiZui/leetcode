import java.util.PriorityQueue;

public class P1921 {
    public static void main(String[] args) {
        System.out.println(new P1921().eliminateMaximum(new int[]{3,5,7,4,5}, new int[]{2,3,6,3,2}));
    }

    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int res =0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] <= speed[i])
                p.offer(1);
            else if (dist[i] % speed[i] == 0) {
                p.offer((dist[i]) / speed[i]);
            }else{
                p.offer(((dist[i]) / speed[i]+1));
            }

        }
        int time = 1;
        while (!p.isEmpty()) {

            int tmp = p.peek();
            if (tmp < time) {
                break;
            }else{
                p.poll();
            }
            time++;
            res++;
        }

        return res;
    }
}
