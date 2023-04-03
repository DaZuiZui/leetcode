import java.util.Arrays;

public class P2594 {
    public static void main(String[] args) {
      //  new P2594().repairCars(new int[]{4,})
        System.out.println(new P2594().repairCars(new int[]{4, 2, 3, 1}, 10));
    }

    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long res =0 ;
        long low = 1;
        Long uper = Long.MAX_VALUE;


        while (low <= uper){
            long mid = low + ((uper - low) /2);
            if (help(ranks ,mid) >= cars){
                res = mid;
                uper = mid-1;
            }else{
                 low = mid+1;
            }
        }

        return res;
    }

    private long help(int[] ranks, long mid) {
        long ans = 0;
        for (int r : ranks) {

            int x = (int)Math.sqrt(mid / r);
            ans += mid;
        }
        return ans;
    }
}
