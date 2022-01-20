package leccod;

public class P9 {
    public static void main(String[] args) {
        System.out.println(P9.isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String str = new String(String.valueOf(x));
        StringBuilder string = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            string = new StringBuilder(string + "" + str.charAt(i));
        }

        if (str.equals(string.toString())){
            return true;
        }

        return false;
    }
}
