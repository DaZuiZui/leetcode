import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P739 {
    public static void main(String[] args) {
        for (int i : new P739().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})) {
            System.out.println(i);
        }

    }

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new LinkedList<>();
        deque.push(0);
        int[] res = new int[temperatures.length];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] <= temperatures[deque.peek()]){
                 deque.push(i);
            }else{
                while (!deque.isEmpty() && temperatures[deque.peek()] < temperatures[i]){
                    res[deque.peek()] = i - deque.peek();
                    deque.poll();
                }
                deque.push(i);
            }
        }

        return res;
    }
}
