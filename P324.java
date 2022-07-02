import java.util.Arrays;

public class P324 {
    public static void main(String[] args) {

    }

    public void wiggleSort(int[] nums) {
        int r = nums.length -1;
        int l = (nums.length-1) /2;
        int[] tmp = nums.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                nums[i] = tmp[l--];
            }else{
                nums[i] = tmp[r--];
            }
        }
    }
}
