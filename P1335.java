import java.util.HashMap;

public class P1335 {
    public static void main(String[] args) {
        System.out.println(new P1335().numPairsDivisibleBy60(new int[]{60,60,60}));
    }

    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res =0 ;
        int n = time.length;
        // (time[i] + time[j]) % 60 == 0;
        // => time[i] % 60  + time[j] + % 60 == 0;
        for (int i = 0; i < n; i++) {
            int tmp = time[i] % 60;
            if (map.containsKey((60 - tmp)%60)) {
                res += map.get((60 - tmp)%60);
            }
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }

        return res;
    }
}
