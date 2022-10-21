import java.util.Arrays;

public class P1590 {
    public static void main(String[] args) {
        System.out.println(new P1590().minSubarray(new int[]{3, 1, 4, 2}, 6));
    }

    int sum = 0;
    int res = Integer.MIN_VALUE;
    public int minSubarray(int[] nums, int p) {
        sum = Arrays.stream(nums).sum();
        dfs(nums,0,sum,p);
        return res;
    }

    public void dfs(int[] nums,int index,int tmpsum,int p){
        if (tmpsum % p == 0){
            System.out.println("Asd"+index);
            return;
        }
        if (tmpsum < p){
            return;
        }

        for (int i = index; i < nums.length; i++) {
            dfs(nums, index+1, tmpsum - nums[i] , p);
        }
    }

}
