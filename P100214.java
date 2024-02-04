public class P100214 {
    public static void main(String[] args) {
        System.out.println(new P100214().returnToBoundaryCount(new int[]{2, 3, -5}));
    }

    public int returnToBoundaryCount(int[] nums) {
        int n = 0;
        int res =0 ;
        int index = 0;
        for (int num : nums) {
            if (index < 0 && index + num == 0){
                res++;
            }else if (index > 0 && index +num == 0){
                res++;
            }
            index += num;
        }
        return res;
    }
}
