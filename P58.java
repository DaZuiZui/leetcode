package leccod;

public class P58 {
    public static void main(String[] args) {
        System.out.println(new P58().lengthOfLastWord("   fly me   to   the moon  "));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.lastIndexOf(' ') == -1) {
            return s.length();
        }

        return s.length()-s.lastIndexOf(' ') - 1;
    }
}
