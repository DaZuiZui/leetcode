package mst;

import contest98.P;

import java.util.*;

public class P1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue[] queues = new LinkedList[6];
        for (int i = 0; i < 6; i++) {
            queues[i] = new LinkedList();
        }

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            if (str.equals("a")) {
                int num = scanner.nextInt();
                int a = scanner.nextInt();
                queues[a].offer(num);
            }else{
                for (int j = 1; j < 6; j++) {
                    if (!queues[j].isEmpty()){
                        System.out.println(queues[j].poll());
                        break;
                    }
                }
            }
        }
    }
}
