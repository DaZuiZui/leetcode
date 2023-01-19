package day5;

public class P494forDFS {
    public static void main(String[] args) {

    }
    int res =0 ;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, target, 0, 0);
        return res;
    }

    public void dfs(int num[],int target,int sum,int index){
        if (index == num.length){
            if (target == sum){
                res++;
                return;
            }
        }else if (index > num.length){
            return;
        }

        dfs(num, target, sum+num[index], index+1);
        dfs(num, target, sum-num[index], index+1);
    }
}
