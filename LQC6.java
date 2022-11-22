import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LQC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        String str = scanner.next();
        for (char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a,b)->{
            int num1 = map.get(a);
            int num2 = map.get(b);
            if (num2 != num1){
                return num2 -num1;
            }

            return a.compareTo(b);
        });

        for (Map.Entry<Character, Integer> tmp : map.entrySet()) {
            Character key = tmp.getKey();
            priorityQueue.offer(key);
        }



        int first = -1;
        Character poll = priorityQueue.poll();
        first = map.get(poll);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(poll);

        while(true){
            Character poll1 = priorityQueue.poll();
            if (map.get(poll1) != first){
                break;
            }
            stringBuilder.append(poll1);
        }

        System.out.println(stringBuilder);
    }
}
