package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P46 {
    public static void main(String[] args) {
        System.out.println(new P46().permute(new int[]{1, 2, 3}));
    }

    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] b = new boolean[nums.length];
        dfs(nums,0,new LinkedList<>(),b);
        return res;
    }

    public void dfs(int[] nums, int index, LinkedList<Integer> list,boolean[] b){
        if (index > nums.length) {
            return;
        }
        if(list.size() == nums.length){
            res.add(new LinkedList<>(list));
        }

        for (int i = 0; i < nums.length; i++) {
            if (b[i] == true) {
                continue;
            }
            b[i] = true;
            list.add(nums[i]);
            dfs(nums, index + 1, list, b);
            b[i] = false;
            list.removeLast();
        }
    }
}
