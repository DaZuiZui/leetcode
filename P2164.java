package leccod;

public class P2164 {
    public static void main(String[] args) {
        System.out.println(new P2164().sortEvenOdd(new int[]{2, 1}));
    }

    public int[] sortEvenOdd(int[] nums) {
        //排序偶数下标的
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = i; j < nums.length-i; j+=2) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        //排序奇数下标
        for (int i = 1 ; i < nums.length ; i+=2){
            for (int j = i; j < nums.length ; j+=2) {
                if (nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
