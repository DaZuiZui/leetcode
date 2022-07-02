import java.util.HashMap;
import java.util.Map;

public class P2068 {
    public static void main(String[] args) {

    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr = new int[26];
        for (char c : word1.toCharArray()) {
            arr[c -'a']++;
        }
        for (char c : word2.toCharArray()) {
            arr[c -'a']--;
        }

        for (int i : arr) {
            if (Math.abs(i) > 3){
                return false;
            }
        }


        return true;
    }
}
