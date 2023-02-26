public class P6369 {
    public static void main(String[] args) {
        System.out.println(new P6369().leftRigthDifference(new int[]{1}));
    }

    public int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] ldp = new int[n+2];
        for (int i = 0; i < n; i++) {
            ldp[i+1] = ldp[i] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int tmp = ldp[n] - ldp[i+1];
            res[i] = Math.abs(ldp[i] - tmp);
        }

        return res;
    }
}
