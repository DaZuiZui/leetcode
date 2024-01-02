public class P1295 {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int res = 0;

        for (int num : nums) {
            if (new String(num+"").length() % 2 == 0){
                res++;
            }
        }

        return res;
    }
}
