import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P6462 {
    public static void main(String[] args) {
        System.out.println(new P6462().minimizedStringLength("ipi"));
    }

    public int minimizedStringLength(String s) {
        int n = s.length();
        int res = 0;
        LinkedList<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < n; i++) {
            if (queue.isEmpty()){
                queue.offer(chars[i]);
            } else if (chars[i] == queue.getLast()){
                queue.pop();
                queue.offer(chars[i]);
            }else{
                queue.offer(chars[i]);
            }
        }
        return queue.size();
    }
}
