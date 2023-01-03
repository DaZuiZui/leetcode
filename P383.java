public class P383 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c-'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            arr[c-'a']--;
        }

        for (int i : arr) {
            if (i < 0){
                return false;
            }
        }

        return true;
    }
}
