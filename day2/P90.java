package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P90 {
    public static void main(String[] args) {
        System.out.println(new P90().subsetsWithDup(new int[]{4,4,4,1,4}));
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        bfs(nums,0,new LinkedList<>());
        return res;
    }
    
    public void bfs(int[] num, int index, LinkedList<Integer> list){
        if (index > num.length){
            return;
        }
        
        res.add(new LinkedList<>(list));

        for (int i = index; i < num.length; i++) {
            //查重
            if (i > index &&  num[i] == num[i-1]){
                continue;
            }
            list.add(num[i]);
            bfs(num, i+1, list);
            list.removeLast();
        }
    }
}

