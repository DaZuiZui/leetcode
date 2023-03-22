public class P27 {
    public static void main(String[] args) {
        new P27().removeElement(new int[]{3,2,2,3},3);
    }

    public int removeElement(int[] nums, int val) {
        int slowPoint = 0;
        int n = nums.length;
        for (int fastPoint = 0; fastPoint < n; fastPoint++) {
            if (nums[fastPoint] == val){

            }else{
                nums[slowPoint] = nums[fastPoint];
                slowPoint++;
            }
        }

        return slowPoint;
    }
}
