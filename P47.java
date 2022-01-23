package leccod;

import java.util.*;

public class P47 {

    public static void main(String[] args) {
        int[] arr=  {1,1,2};
        new P47().permuteUnique(arr);
    }

    ArrayList<List<Integer>> arrayList = new ArrayList();
    Set<List<Integer>> set = new HashSet<>();
    ArrayList<Integer> listtemp = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,0,used);

        for (List<Integer> l : set){
            arrayList.add(l);
        }

        return  arrayList;
    }

    public void backtracking(int[] nums,int start,boolean[] used){
        if (nums.length == start){
            set.add(new ArrayList<>(listtemp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true){
                continue;
            }
            listtemp.add(nums[i]);
            used[i] = true;
            backtracking(nums, start+1, used);
            used[i] = false;
            listtemp.remove(listtemp.size()-1);
        }
    }
}

