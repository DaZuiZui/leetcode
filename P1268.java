import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1268 {
    public static void main(String[] args) {
        System.out.println(new P1268().suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse"));
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        int n = searchWord.length();
        Arrays.sort(products);
        for (int i = 1; i <= n; i++) {
            String substring = searchWord.substring(0, i);
            List<String> tmp = new ArrayList<>();
            int count = 0;
            for (String product : products) {
                if (product.startsWith(substring)){
                    count++;
                    tmp.add(product);

                    if (count == 3){
                        break;
                    }
                }
            }
            if (tmp != null){
                res.add(new ArrayList<>(tmp));
            }
        }

        return res;
    }
}
