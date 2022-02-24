package leccod;

import java.util.HashMap;

public class P205 {
    public static void main(String[] args) {
        System.out.println(new P205().isIsomorphic("egg", "add"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if ((map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) ||
                    (map1.containsKey(t.charAt(i)) && map1.get(t.charAt(i)) != s.charAt(i) )){
                    return false;

            }else{

                map.put(s.charAt(i),t.charAt(i));
                map1.put(t.charAt(i),s.charAt(i));
            }
        }

        return true;
    }
}
