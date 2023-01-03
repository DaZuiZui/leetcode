import java.util.*;

public class P15 {
    public static void main(String[] args) {
        System.out.println(new P15().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n-1;
            while (l < r){
                if (nums[i] + nums[l] + nums[r] == 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    l++;
                    r--;
                    set.add(tmp);
                }else if (nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> list : set) {
            res.add(list);
        }

        return res;
    }
}
