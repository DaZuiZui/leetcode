package leccod;

public class P344 {
    public static void main(String[] args) {
        new P344().reverseString(new char[]{'h','l','o'});
    }

    public void reverseString(char[] s) {
        String str = new String(s);
        for (int i = 0,j=s.length-1; i < s.length; i++,j--) {
            s[i] = str.charAt(j);
        }
    }
}
