import java.util.HashSet;
import java.util.Set;

public class P2399 {
    public static void main(String[] args) {
        System.out.println(new P2399().checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    };

    public boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < n ; i++) {
            char c = chars[i];
            if (set.add(c)){
                //查看下一次
                int indexsecondary = s.indexOf(c,i+1);
                int targer = indexsecondary - (i+1);
                System.out.println(targer);
                if (distance[c - 'a'] != targer){
                    //System.err.println(i+" "+distance[c - 'a']+" "+ targer);
                    return false;
                }
            }else{

            }
        }

        return true;
    }
}
