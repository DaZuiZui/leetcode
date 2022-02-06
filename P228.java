package leccod;

import lancup.lancup2021.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P228 {
    public static void main(String[] args) {
        System.out.println(new P228().summaryRanges(new int[]{}));
    }

    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList();
        if (nums.length == 0){
            return list;
        }
        //Arrays.sort(nums);
        int start = nums[0];
        int end = 0;
        boolean a = true;
        for (int i = 0; i < nums.length; i++) {
            //记录开始坐标
            if (a){
                start = nums[i];
                a = false;
            }
            if ( i < nums.length-1&&nums[i] +1 != nums[i+1]){
                a = true;
                //记录结束坐标
                end = nums[i];
                if (start == end){
                    list.add(start+"");
                }else{
                    list.add(start+"->"+end);
                }
                continue;
            }else if(i < nums.length-1 && nums[i] +1 == nums[i+1] && i+1 == nums.length-1){
                end = nums[i+1];
                if (start == end){
                    list.add(start+"");
                }else{
                    list.add(start+"->"+end);
                }
                i++;
                continue;
            }


            if (i == (nums.length -1)){
                list.add(nums[i]+"");
            }

        }


        return list;
    }
}
