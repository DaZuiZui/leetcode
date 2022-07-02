import java.util.Locale;

public class P2315 {
    public static void main(String[] args) {
        System.out.println(new P2315().countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public int countAsterisks(String s) {
        char[] chars = s.toCharArray();
        int res =0;
        int count =0;
        for (char aChar : chars) {
            if (aChar == '|'){
                count++;
            }

            if (count %2==0){
                count=0;
            }

            if (count == 0 && aChar=='*'){
                res++;
            }
        }

        return res;
    }
}
