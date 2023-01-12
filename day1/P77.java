package day1;

import java.util.ArrayList;
import java.util.List;

public class P77 {
    public static void main(String[] args) {
        new P77().combine(1,1);
    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        bfs(1,n,k,new ArrayList<>());
        System.out.println(res);
        return res;
    }

    public void bfs(int index,int n,int k ,List<Integer> list){
        if (list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i <= n; i++) {
            list.add(i);
            bfs(i+1,n,k,list);
            //back
            list.remove(list.size()-1);
        }
    }
}
