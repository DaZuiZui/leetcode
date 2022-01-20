package leccod;

import java.util.*;

public class P18 {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        System.out.println(new P18().fourSum(arr, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int length = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length-1; j++) {
                int l = j +1;
                int r = length -1;

                while(l < r){
                    if (nums[r] +nums[l] + nums[i] +nums[j] ==target){
                        List list = new ArrayList();
                        list.add(nums[r]);
                        list.add(nums[l]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        set.add(list);
                        r--;
                        l++;
                    }else if(nums[r] +nums[l] + nums[i] +nums[j] < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }

        List list = new ArrayList();
        list.addAll(set);
        return list;
    }
}
