package leccod;

import java.util.LinkedList;
import java.util.Queue;

public class P1823 {
    public static void main(String[] args) {

    }

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        //让所有小朋友加入队列
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.poll();
    }
}
