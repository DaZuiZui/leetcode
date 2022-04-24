package leccod;

public class P162 {
    public static void main(String[] args) {

    }

    /**
     * 峰值元素是指其值严格大于左右相邻值的元素。
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if (nums[0] > nums[1]){
            return nums[0];
        }else if (nums[nums.length-1] < nums[nums.length-2]){
            return nums[nums.length-2];
        }

        for (int i = 1; i < nums.length -1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return 0;
    }
}
