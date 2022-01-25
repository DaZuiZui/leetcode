package leccod;

public class P28 {
    public static void main(String[] args) {
        System.out.println(new P28().strStr("", ""));
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() ==0){
            return 0;
        }

        int length = needle.length();
        for(int i = 0 ; i < haystack.length() ; i++){
            if (i+needle.length() > haystack.length()){
                if (haystack.substring(i,haystack.length()).equals(needle)) {
                    return i;
                }
            }else{
                if (haystack.substring(i,needle.length()+i).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
