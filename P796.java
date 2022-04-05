package leccod;



import java.util.Arrays;

public class P796 {
    public static void main(String[] args) {
        String  s = "abcde", goal = "cdeab";
        System.out.println(new P796().rotateString(s, goal));
    }
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
         String str = goal+goal;

        return str.contains(s);
    }
}
