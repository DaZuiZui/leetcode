public class P2697 {
    public static void main(String[] args) {
        System.out.println(new P2697().makeSmallestPalindrome("abcd"));
    }

    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        for (int i = 0; i < n/2; i++) {
            arr[i] = arr[n-i-1] = (char) ('a' + Math.min(arr[i]-'a',arr[n-i-1]-'a'));
        }
        return new String(arr);
    }
}
