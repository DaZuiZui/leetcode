package leccod;

public class OfferII019 {
    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        for (int l = 0,r=s.length()-1; l < r; l++,r--) {
            if (s.charAt(l) != s.charAt(r)){
                return isPalindrome(s,l,r-1) || isPalindrome(s,l+1,r);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int l , int r) {
        while (l <r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}
