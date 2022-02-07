package leccod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.TreeSet;

public class P414 {
    public static void main(String[] args) {
        System.out.println(new P414().thirdMax(new int[]{1,2,3}));
    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int inedx = 0;

        //如果长度小于三
        if (set.size() <3){
            for (Integer integer : set) {
                if (inedx == set.size()-1){
                    return integer;
                }
                inedx++;
            }
        }
        //如果长度大于3
        else{
            for (Integer integer : set) {

                if (inedx == set.size()-3){
                    return integer;
                }
                inedx++;
            }
        }

        return -1;
    }
}
