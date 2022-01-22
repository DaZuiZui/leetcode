package leccod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        new P46().permute(arr);
    }


    List<List<Integer>> list = new ArrayList<>();
    List<Integer> listtemp =  new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] u = new boolean[nums.length];
        zhengli(nums,0,u);


        return list;
    }

    Map map = new HashMap();

    public void zhengli(int[] arr,int start,boolean[] used){
        if (arr.length == start){
            list.add(new ArrayList<Integer>(listtemp));

            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i]){
                continue;
            }
            listtemp.add(arr[i]);
            used[i] = true;
            zhengli(arr,start+1,used);
            listtemp.remove(listtemp.size()-1);
            used[i] = false;
        }
    }
}
