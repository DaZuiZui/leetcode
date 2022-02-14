package leccod;

public class P521 {
    public static void main(String[] args) {

    }

    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;

        return Math.max(a.length(),b.length());
    }
}
