package leccod;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class P26 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(new P26().removeDuplicates(arr));

    }


    Set<Integer> set = new TreeSet();
    public int removeDuplicates(int[] nums) {


        for(Integer num : nums){
            set.add(num);
        }

        int arrlength = 0;

        for(Integer num : set){
            nums[arrlength] = num;
            arrlength++;
        }


        return arrlength;
    }
}
