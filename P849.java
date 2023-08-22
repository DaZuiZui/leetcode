import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class P849 {
    public static void main(String[] args) {
        System.out.println(new P849().maxDistToClosest(new int[]{0, 1}));
    }

    public int maxDistToClosest(int[] seats) {
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = seats.length;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                set.add(i);
            }
        }

        int l = 0;
        int r = 0;
        int sum = 0;
        int res =Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            Integer target = seats[i];

            if (target == 1){
                continue;
            }

            Integer floor = set.floor(i);
            Integer ceiling = set.ceiling(i);
            if (floor != null && ceiling != null) {
                int llocal = i - floor;
                int rlocla = ceiling - i;
                int min = Math.min(llocal, rlocla);
                res = Math.max(res, min);
            }else if(floor == null){
                res = Math.max(res,ceiling-i);
            }else if (ceiling == null){
                res = Math.max(res,i-floor);
            }

        }

        return res;
    }
}
