package leccod;

import java.util.*;

public class Offer007II {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set  = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int l = i+1;
            int r = nums.length-1;
            while (l < r){
                if (nums[i] + nums[l] +nums[r] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    set.add(temp);
                }else if(nums[i] + nums[l] +nums[r] < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        res.addAll(set);
        return res;
    }
}
