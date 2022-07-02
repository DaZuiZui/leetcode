import java.util.ArrayList;
import java.util.List;

public class P60 {
    public static void main(String[] args) {
        System.out.println(new P60().getPermutation(3, 3));
    }

    private List<String> res = new ArrayList();
    int end = 0;
    public String getPermutation(int n, int k) {
        boolean[] b =new boolean[n+1];
        dfs(n,1,"",b,k);
        res.sort(null);
        this.end = k;
        System.out.println(res);
        return res.get(k-1);
    }

    public void dfs(int n,int index,String str,boolean[] b,int k){
        if (res.size() == k){
            return;
        }
        if (index > n){
            res.add(str);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (b[i]){
                continue;
            }

            b[i] = true;
            dfs(n, index+1, str+""+i, b,k);
            b[i] = false;
        }
    }
}
