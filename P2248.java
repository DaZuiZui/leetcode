package leccod;

import java.util.ArrayList;
import java.util.List;

public class P2248 {
    public static void main(String[] args) {
        new P2248().intersection(new int[][]{
                {3,1,2,4,5},
                {1,2,3,4},
                {3,4,5,6}
        });
    }

    public List<Integer> intersection(int[][] nums) {
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        List<Integer> res = new ArrayList();
        //如果传入的数据为null位或长度为1 返回null
        if (nums.length < 1){
            return res;
        }


        for (int[] num : nums) {
            List<Integer> temp = new ArrayList<>();
            for (int i : num) {
                temp.add(i);
            }
            arrayList.add(temp);
        }

        for (int i : nums[0]) {
            boolean sw = false;
            for (int j = 0; j < arrayList.size(); j++) {
                List<Integer> temp = arrayList.get(j);
                if(temp.contains(i)){
                    sw = true;
                }else{
                    sw = false;
                    break;
                }
            }

            if (sw){
                res.add(i);
            }
        }
        res.sort(null);
        return res;
    }
}
