import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Luogu1781 {
    static class Entry{
        public Integer index;
        public BigInteger bigInteger;

        public Entry(Integer index, BigInteger bigInteger) {
            this.index = index;
            this.bigInteger = bigInteger;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Entry> priorityQueue = new PriorityQueue<>((a,b)->{
            if (a.bigInteger.compareTo(b.bigInteger) > 0){
                return -1;
            }else{
                return 1;
            }
        });
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            BigInteger bigInteger = new BigInteger(str);
            Entry entry = new Entry(i,bigInteger);
            priorityQueue.offer(entry);
        }
        System.out.println(priorityQueue.peek().index+1);
        System.out.println(priorityQueue.peek().bigInteger);
    }
}
