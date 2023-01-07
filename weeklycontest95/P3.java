package weeklycontest95;

public class P3 {
    public static void main(String[] args) {
        System.out.println(new P3().xorBeauty(new int[]{1, 4}));
    }

    int res = 0;

    public int xorBeauty(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    res ^= (nums[i] | nums[j]) & nums[k];
                }
            }
        }
        return res;
    }


}
