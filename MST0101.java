package leccod;

import java.util.HashMap;

public class MST0101 {
    public static void main(String[] args) {

    }

    public boolean isUnique(String astr) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : astr.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for (char c : astr.toCharArray()) {
            if (map.get(c) > 1) {
                return false;
            }
        }
        return true;
    }
}
