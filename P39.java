package leccod;

import java.util.*;

public class P39 {
    public static void main(String[] args) {
        System.out.println(new P39().combinationSum(new int[]{2,3,5}, 8));
    }

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> listtemp = new ArrayList<Integer>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        help(candidates, target,0,0);
        //相同添加

        list.addAll(set);
        System.out.println();
        return list;
    }

    public  void help(int[] candidates, int target,int sum,int startindex){
        if (sum == target){

            System.out.println(listtemp);

            set.add(new ArrayList<Integer>(listtemp));

            return;
        }

        for (int i = startindex; i < candidates.length; i++) {
            if (candidates[i]+sum <= target){
                listtemp.add(candidates[i]);
                help(candidates,target,candidates[i]+sum,i);
                listtemp.remove(listtemp.size()-1);
            }
        }
    }
}
