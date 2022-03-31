package leccod;

public class MST0803 {
    public static void main(String[] args) {

    }

    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i){
                return i;
            }
        }

        return -1;
    }
}
