import java.util.ArrayList;
import java.util.List;

public class P1387 {
    public static void main(String[] args) {
        System.out.println(new P1387().getKth(12, 15, 2));
    }

    public int getKth(int lo, int hi, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = lo ;i <= hi; i++) {
            list.add(i);
        }

        list.sort((a,b)->{
            int tmpa = dfs(a,0);
            int tmpb = dfs(b,0);
            if (tmpa == tmpb){
                return a >= b  ? 0 : -1;
            }else{
                return tmpa >= tmpb ? 0 : -1;
            }
        });

        return list.get(k-1);
    }
    
    public int dfs(int x,int res){
        if (x == 1){
            return res;
        }else if (x %2 == 0){
            return dfs(x / 2,res+1);
        }else {
            return dfs(3*x+1,res+1);
        }
    }
}
