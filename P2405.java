import java.util.HashSet;
import java.util.Set;

public class P2405 {
    public static void main(String[] args) {
        System.out.println(new P2405().partitionString("ssssss"));
    }

    public int partitionString(String s) {
        int n = s.length();
        int res = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (set.contains(c)){
                set.clear();
                res++;
            }
            set.add(c);
        }

        return set.isEmpty() ? res : res +1;
    }
}
