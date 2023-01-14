package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P78 {
    public static void main(String[] args) {
        System.out.println(new P78().subsets(new int[]{1, 2, 3}));
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        boolean[] arr = new boolean[nums.length];

        bfs(nums,0,new LinkedList<>(),arr);
        return res;
    }

    public void bfs(int[] nums,int index, LinkedList<Integer> list,boolean[] b){
        if (index > nums.length){
            return;
        }

        //录用
        res.add(new LinkedList<>(list));

        for (int i = index; i < nums.length; i++) {
            if (b[i]){
                continue;
            }
            b[i] = true;
            list.add(nums[i]);
            bfs(nums, i+1, list,b);
            list.removeLast();
            b[i] = false;
        }
    }
}
