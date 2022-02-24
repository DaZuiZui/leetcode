package leccod;

public class P917 {
    public static void main(String[] args) {
        System.out.println(new P917().reverseOnlyLetters("z<*zj"));
    }

    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l =0,r= s.length()-1;
        while(true){
            while(l < r && !Character.isLetter(arr[l])){
                l++;
            }

            while(l < r && !Character.isLetter(arr[r])){
                r--;
            }

            if ( l >= r ){
                break;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }
}
