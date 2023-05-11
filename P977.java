public class P977 {
    public static void main(String[] args) {
        int[] ints = new P977().sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        int[] res = new int[n--];
        while (n >= 0){
            if (nums[l] * nums[l] >= nums[r] * nums[r]){
                res[n--] = nums[l] * nums[l++];
            }else{
                //System.out.println(r);
                res[n--] = nums[r] * nums[r--];
            }
        }
        return res;
    }
}
