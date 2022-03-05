package leccod;

public class P541 {
    public static void main(String[] args) {
        System.out.println(new P541().reverseStr("abcd", 2));
    }

    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length(); i+=k) {
            if (i + k < s.length()){
                StringBuilder stringBuilder = new StringBuilder(str.substring(i,k+i));
                res.append(stringBuilder.reverse());
                i+=k;
                if (i + k < s.length()){
                    stringBuilder = new StringBuilder(str.substring(i,k+i));
                    res.append(stringBuilder);
                }else{
                    stringBuilder = new StringBuilder(str.substring(i,s.length()));
                    res.append(stringBuilder);
                }
            }else{
                StringBuilder stringBuilder = new StringBuilder(str.substring(i,s.length()));
                res.append(stringBuilder.reverse());
                break;
            }
        }

        return res.toString();
    }
}
