package leccod;

public class P34 {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int first =-1;
        int end   =-1;
        for (int i = 0; i < nums.length; i++) {
             if (nums[i] == target){
                 if (first == -1){
                     first =end = i;
                 }else{
                     end =i;
                 }
             }
        }
        int[] arr= {first,end};
        return arr;
    }

}
