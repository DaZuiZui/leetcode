public class P344 {
    public static void main(String[] args) {
        new P344().reverseString(new char[]{
                'a','b','c'
        });
    }

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while (l < r){
            s[l] = (char) (s[l] ^ s[r]);
            s[r] = (char) (s[l] ^ s[r]);
            s[l] = (char) (s[l] ^ s[r]);
            l++;
            r--;
        }
    }
}
