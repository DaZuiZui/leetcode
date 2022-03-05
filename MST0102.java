package leccod;

import java.util.Arrays;

public class MST0102 {
    public static void main(String[] args) {

    }

    public boolean CheckPermutation(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);
        return str1.equals(str2);
    }
}
