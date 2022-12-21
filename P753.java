import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class P753 {
    public static void main(String[] args) {
        System.out.println(new P753().maximumScore(6, 6, 6));
    }

    public int maximumScore(int a, int b, int c) {
       PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x,y)->{
           return y-x;
       });

       priorityQueue.offer(a);
       priorityQueue.offer(b);
       priorityQueue.offer(c);
       int res =0;
       while (true){
           int max = priorityQueue.poll();
           int mim = priorityQueue.poll();
           int min = priorityQueue.poll();

           //是否存在3个满桶
           if (min > 0){
               priorityQueue.offer(--max);
               priorityQueue.offer(--min);
               priorityQueue.offer(mim);
               res++;
           }
           //存在一个空桶
           else if (min == 0){
               if (max == mim){
                   res += max;
                   return res;
               }else{
                   return res += Math.min(mim,max);
               }
           }
       }
    }
}
