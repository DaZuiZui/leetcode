package day1;

import java.util.*;

public class P40 {
    public static void main(String[] args) {
        System.out.println(new P40().combinationSum2(new int[]{2,5,2,1,2}, 5));
    }
    List<List<Integer>>  res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    int n = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.n = candidates.length;

        bfs(candidates,target,0,new LinkedList<>());
        return res;
    }

    public void bfs(int[] candidates, int target, int index, LinkedList<Integer> list){
        //剪枝叶
        if (target == 0){
            res.add(new LinkedList<>(list));
            return;
        }else if (target < 0){
            return;
        }

        for (int i = index; i < n; i++) {
            //剪枝叶
            if ((i > index && candidates[i] == candidates[i-1])){
                continue;
            }
            list.add(candidates[i]);
            bfs(candidates, target - candidates[i], i+1, list);
            list.removeLast();
        }
    }
}
