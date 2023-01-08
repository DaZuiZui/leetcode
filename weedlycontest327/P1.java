package weedlycontest327;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {

    }

    public boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> map1 =new HashMap<>();
        Map<Character, Integer> map2 =new HashMap<>();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int min = Math.min(map1.size(),map2.size());
        int max = Math.max(map1.size(),map2.size());
        for (Map.Entry<Character, Integer> m1 : map1.entrySet()) {
            for (Map.Entry<Character, Integer> m2 : map1.entrySet()) {
                if (
                        !m2.getKey().equals(m1.getKey()) &&
                                (min+1) == max    &&
                                m1.getValue() == m2.getValue()
                ){
                    return true;
                }


            }
        }
        return false;
    }
}
