package leccod;

public class P35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(new P35().searchInsert(arr, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0 ; i < nums.length ;i++){
            if (target <= nums[i]){
                index = i;
                break;
            }
        }

        if (index == -1){
            index = nums.length;
        }

        return index;
    }
}
