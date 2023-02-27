import java.util.ArrayList;
import java.util.List;

public class P1415 {
    public static void main(String[] args) {
        System.out.println(new P1415().getHappyString(3, 9));
    }

    int n = 0;
    int k = 0;
    List<String> list = new ArrayList<>();

    public String getHappyString(int n, int k) {
        this.n = n;
        this.k = k;
        dfs("");
        return k > list.size() ? "" : list.get(k-1);
    }

    public void dfs(String str){
        if (list.size() == k) {
            return;
        }
        int len = str.length();
        if (len == n){
            list.add(str);
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (len != 0 && str.charAt(len - 1) == ('a'+i)){
                continue;
            }
            dfs( (str+((char)('a'+i))));
        }
    }
}
