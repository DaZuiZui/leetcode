import java.util.HashSet;

public class P1461 {
    public static void main(String[] args) {
        System.out.println(new P1461().hasAllCodes("0110", 2));
    }

    String str = "";
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set  = new HashSet<>();
        int l =0 ;
        int r = k;
        int n = s.length();
        for (int i = r; i < n; i++,l++) {
            set.add(s.substring(l,r));
        }

        return set.size() == Math.pow(2,k);
    }

}
