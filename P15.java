package leccod;

import java.util.*;

public class P15 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(new P15().threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);
        int lengthofarr = nums.length;

        for (int i = 0; i < lengthofarr; i++) {
            int l = i +1;
            int r = lengthofarr -1;

            // R > L is to ensure that the length must be greater than or equal to 3
            while(r > l){
                if (nums[i] + nums[r] + nums[l] == 0 ){
                    List list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[r]);
                    list.add(nums[l]);
                    set.add(list);
                    l++;
                    r--;
                }else if (nums[i] + nums[r] + nums[l] < 0){
                    l++;
                }else{
                     r--;
                }
            }
        }

        List<List<Integer>> arrlist = new ArrayList<>();
        arrlist.addAll(set);
        return arrlist;
    }
}
