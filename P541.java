public class P541 {
    public static void main(String[] args) {
        System.out.println(new P541().reverseStr("abcdefg", 2));
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i+= 2*k) {
            int l = i;
            int r = Math.min(n-1,i+k-1);
            while (l < r){
                chars[l] = (char)(chars[l] ^ chars[r]);
                chars[r] = (char)(chars[l] ^ chars[r]);
                chars[l] = (char)(chars[l] ^ chars[r]);
                l++;
                r--;
            }
        }


        return new String(chars);
    }
}
