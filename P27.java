package leccod;

import java.util.ArrayList;
import java.util.List;

public class P27 {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList();

        for(int i = 0 ; i< nums.length ;i++){
            if(nums[i] != val){
                list.add(nums[i]);
            }
        }

        for(int i = 0 ;i<list.size() ;i++ ){
            nums[i] = list.get(i);
        }


        return list.size();
    }
}
