package leccod;

public class P2016 {
    public static void main(String[] args) {
        System.out.println(new P2016().maximumDifference(new int[]{7}));
    }

    public int maximumDifference(int[] nums) {
        int max =-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] < nums[j]){
                    max = Math.max(max,nums[j]-nums[i]);
                }
            }
        }
        return max;
    }
}
