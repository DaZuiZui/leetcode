import java.util.Arrays;

public class P1283 {
    public static void main(String[] args) {
        System.out.println(new P1283().smallestDivisor(new int[]{44,22,33,11,1}, 5));
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int l = 1;
        int r = Arrays.stream(nums).max().getAsInt();
        int res =Integer.MAX_VALUE ;
        while (l <= r){
            int restmp =0;
            int mid = l + ((r-l)>>1);
            for (int i = 0; i < n; i++) {
                restmp += nums[i] / mid;
                if (nums[i] % mid != 0) restmp++;
            }

            if (restmp > threshold){
                l = mid+1;
            }else {
                res = Math.min(res,mid);
                r = mid-1;
            }
        }

        return res;
    }
}
