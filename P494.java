public class P494 {
    public static void main(String[] args) {

    }

    private int res =0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums,target,0,0);
        return res;
    }

    public void dfs(int[] nums,int target,int sum,int index){
        if (nums.length == index){
            if (target == sum){
                res++;
            }
        }else{
            dfs(nums, target, sum+nums[index], index++);
            dfs(nums, target, sum-nums[index], index++);
        }
    }
}
