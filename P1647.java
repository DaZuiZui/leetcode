import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class P1647 {
    public static void main(String[] args) {
        System.out.println(new P1647().minDeletions("bbcebab"));
    }

    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int res =0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> tmp : map.entrySet()) {
            int in = tmp.getValue();
            while (set.contains(in)){
                res++;
                in--;
            }

            //
            if(in!=0)
                set.add(in);
        }

        return res;
    }
}
