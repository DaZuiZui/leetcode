package leccod;

public class P345 {
    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {
        int l = 0,r = s.length()-1;
        char[] arr = s.toCharArray();
        while (l < r){
            while (l < s.length() && !isVowels(arr[l]+"")){
                l++;
            }

            while (r > 0 && !isVowels(arr[r]+"")) {
                r--;
            }

            //左右指针交换
            if (l < r){
                swap(arr,l,r);
                r--;
                l++;
            }
        }

        return new String(arr);
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean isVowels(String a){
        String str = "aeiouAEIOU";

        return  str.contains(a);
    }
}
