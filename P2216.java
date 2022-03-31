package leccod;

public class P2216 {
    public static void main(String[] args) {
        System.out.println(1%2);
    }

    public int minDeletion(int[] nums) {
        int res =0 ;
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]){
                res++;
            }else{
                i++;
            }
        }

        if ((nums.length - res)%2 == 1){
            res++;
        }
        return res;
    }
}
