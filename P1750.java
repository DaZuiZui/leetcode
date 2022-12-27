public class P1750 {
    public static void main(String[] args) {
        System.out.println(new P1750().minimumLength("ca"));
    }

    public int minimumLength(String s) {

        int n = s.length();
        int l = 0, r = n-1;
        while (l < r && s.charAt(l) == s.charAt(r)){
            char c = s.charAt(l);
            while (l <= r && c == s.charAt(l)) l++;

            while (l <= r && c == s.charAt(r)) r--;
        }
        return r-l+1;
    }
}
