import java.util.ArrayList;
import java.util.List;

public class P1441 {
    public static void main(String[] args) {
        System.out.println(new P1441().buildArray(new int[]{1,2, 3}, 3));
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int pres =0;
        for (int i : target) {
            for (int j = 0; j < i - pres -1; j++) {
                res.add("Push");
                res.add("Pop");
            }
            res.add("Push");
            pres = i;
        }

        return res;
    }
}
