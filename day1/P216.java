package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P216 {
    public static void main(String[] args) {
        List<List<Integer>> lists = new P216().combinationSum3(3, 9);
        System.out.println(lists);
    }
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        bfs(1,n,k,new LinkedList<>());
        return res;
    }

    /**
     * bfs
     * @param index 起始位置
     * @param n
     * @param k
     * @param list
     */
    public void bfs(int index, int n , int k, LinkedList<Integer> list){
        if (n == 0 && list.size() == k){
            res.add(new LinkedList<>(list));
            return ;
        }else if (n < 0 || list.size() >= k){
            return ;
        }

        for (int i = index; i <= 9; i++) {
            int tmp = n - i;
            //太大了
            if (tmp < 0){
                return ;
            }
            list.add(i);
            bfs(i + 1, n-i, k, list);
            //撤回
            list.removeLast();
        }

        return ;
    }

}

