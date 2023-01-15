package weedlycontest328;

public class P {
    public static void main(String[] args) {
        System.out.println(new P().differenceOfSum(new int[]{1, 15, 6, 3}));
    }

    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        for (int num : nums) {
            sum1+=num;
        }

        int num2 = 0;
        for (int num : nums) {
            while (num > 0){
                num2 += num %10;
                num/=10;
            }
        }

        return Math.abs(sum1 - num2);
    }
}
