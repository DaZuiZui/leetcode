public class P2185 {
    public static void main(String[] args) {

    }

    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.indexOf(pref) == 0) res++;
        }

        return res;
    }
}
