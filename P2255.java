package leccod;

public class P2255 {
    public static void main(String[] args) {
        System.out.println(new P2255().countPrefixes(new String[]{"a", "b", "c", "ab","bc", "abc"}, "abc"));
    }

    public int countPrefixes(String[] words, String s) {
        int res = 0;

        for (int i = 0; i < words.length; i++) {
            if (s.indexOf(words[i]) == 0) {
                res++;
            }
        }

        return res;
    }
}
