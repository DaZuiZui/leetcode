import java.util.Arrays;

public class P1608 {
    public static void main(String[] args) {
        
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i){
                    count++;
                }

                if (count == i){
                    return i;
                }
            }
        }
        return -1;
    }
}
