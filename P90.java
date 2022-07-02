import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P90 {
    public static void main(String[] args) {
        new P90().subsetsWithDup(new int[]{1,2,2});
    }

    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> tmp = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] b = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums,0,b);
        System.out.println(res);
        return res;
    }

    public void dfs(int[] nums,int index,boolean[] b){
        res.add(new ArrayList<>(tmp));

        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i-1] && !b[i-1] ){
                continue;
            }
            b[i] = true;
            tmp.add(nums[i]);
            dfs(nums, i+1, b);
            b[i] = false;
            tmp.remove(tmp.size()-1);
        }
    }
}
