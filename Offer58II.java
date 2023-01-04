public class Offer58II {
    public static void main(String[] args) {
        System.out.println(new Offer58II().reverseLeftWords("abcdefg", 2));
    }

    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        int length = s.length();
        reverse(chars,0,length-1);
        reverse(chars,0,length-1-n);
        reverse(chars,length-n,length-1);

        return new String(chars);
    }

    public void reverse(char[] chars, int l, int r) {
        while (l < r) {
            chars[l] ^= chars[r];
            chars[r] ^= chars[l];
            chars[l] ^= chars[r];
            l++;
            r--;
        }
    }
}
