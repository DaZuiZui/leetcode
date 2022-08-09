public class P553 {
    public static void main(String[] args) {

    }

    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = nums.length;;
        stringBuilder.append(nums[0]);
        if (n > 1){
            stringBuilder.append("/");
        }
        if (n > 2){
            stringBuilder.append("(");
        }

        for (int i = 1; i < nums.length-1; i++) {
            stringBuilder.append(nums[i]+"/");
        }
        if (n > 1){
            stringBuilder.append(nums[nums.length-1]);
        }
        if (n > 2){
            stringBuilder.append(")");
        }

        return stringBuilder.toString();
    }
}
