import java.util.HashMap;
import java.util.Map;

public class P1160 {
    public static void main(String[] args) {
        System.out.println(new P1160().countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }

    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0;
        for (char c : chars.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (String word : words) {
            Map<Character,Integer> otherMap = new HashMap<>();
            boolean b = true;
            for (char c : word.toCharArray()) {
                otherMap.put(c,otherMap.getOrDefault(c,0)+1);
            }

            for (char c : word.toCharArray()) {
                if (map.getOrDefault(c,0) < otherMap.getOrDefault(c,0)){
                    //System.out.println(c+"  " + map.getOrDefault(c,0)  + " and"+otherMap.getOrDefault(c,0));
                    b = false;
                    break;
                }
            }

            if (b){
                res+= word.length();
            }
            //System.out.println();
        }
        return res;
    }
}
