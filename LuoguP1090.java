import java.util.PriorityQueue;
import java.util.Scanner;

public class LuoguP1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->{
            return a-b;
        });

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            queue.add(number);
        }

        int res = 0;

        while (!queue.isEmpty()){
            //判断下堆中元素是否大于1个
            if (queue.size() > 1){
                int num1 = queue.poll();
                int num2 = queue.poll();
                int tmp = num1 + num2;
                res += tmp;
                //判断是否可放
                if (!queue.isEmpty())
                    queue.add(tmp);
            }else{
                res += queue.poll();
            }
        }

        System.out.println(res);
    }
}
