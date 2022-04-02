package leccod;

import java.util.HashSet;

public class P1684 {
    public static void main(String[] args) {

    }

    public int countConsistentStrings(String allowed, String[] words) {
        int res = words.length;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))){
                    res--;
                    break;
                }
            }
        }

        return res;
    }
}
