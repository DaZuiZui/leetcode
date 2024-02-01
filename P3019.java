package leccod;

public class P3019 {
    public static void main(String[] args) {
        System.out.println();
    }

    public int countKeyChanges(String s) {
        int res = 0;
        String s1 = s.toLowerCase();
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(i-1)){
                res++;
            }
        }
        return res;
    }
}
