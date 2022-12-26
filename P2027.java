import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class P2027 {
    public static void main(String[] args) {
        System.out.println(new P2027().minimumMoves("XXOX"));
    }

    public int minimumMoves(String s) {
        int res =0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'X'){
                res++;
                i+=2;
            }
        }

        return res;
    }
}
