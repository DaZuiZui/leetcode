package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P39 {
    public static void main(String[] args) {
        System.out.println(new P39().combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    List<List<Integer>> res = new ArrayList<>();
    int n = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.n = candidates.length;
        bfs(candidates,target,0,new LinkedList<>());
        System.out.println(res);
        return res;
    }

    public void bfs(int[] candidates, int target,int index,LinkedList<Integer> list){
        //剪枝叶
        if (target == 0){
            res.add(new LinkedList<>(list));
            return;
        }

        for (int i = index; i < this.n; i++) {
            //剪枝叶
            if (target - candidates[i] < 0){
                break;
            }
            list.add(candidates[i]);
            bfs(candidates, target - candidates[i], i, list);
            list.removeLast();
        }
    }
}
