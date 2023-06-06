import java.util.LinkedList;
import java.util.Queue;

public class P2696 {
    public static void main(String[] args) {
        System.out.println(new P2696().minLength("BJKDKABJ"));
    }

    //ABCDEFGHIJKLMNOPQRSTUVWSYZ
    public int minLength(String s) {
        int n = s.length();
        LinkedList<Character> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (queue.isEmpty()){
                queue.offer(s.charAt(i));
            }else{
                if (queue.getLast() == 'A' && s.charAt(i) == 'B' || queue.getLast() == 'C' && s.charAt(i) == 'D' ){
                    queue.removeLast();
                }else{
                    queue.offer(s.charAt(i));
                }
            }
        }

        return queue.size();
    }
}
