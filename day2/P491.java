package day2;

import java.util.*;

public class P491 {
    public static void main(String[] args) {
        System.out.println(new P491().findSubsequences(new int[]{4,6,7,7}));
    }

    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums,0,new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums,int index,LinkedList<Integer> list){
        if (index > nums.length){
            return;
        }
        if (list.size() >=2)
        {
            if (set.add(new LinkedList<>(list))) {
                res.add(new LinkedList<>(list));
            }
        }


        for (int i = index; i < nums.length; i++) {
            //查看是否底层
            if (!list.isEmpty() && nums[i] < list.getLast()){
                continue;
            }

            list.add(nums[i]);
            dfs(nums, i+1, list);
            list.removeLast();
        }
    }
}
