import java.util.HashMap;

public class P6255 {
    public static void main(String[] args) {

    }


    public int minScore(int n, int[][] roads) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        //初始化第一个城市和最后一个城市是肯定能到达的
        map.put(0,true);
        map.put(n,true);
        //查找最少分
        for (int i = 0; i < n; i++) {
            for (int[] road : roads) {
                int start = road[0];
                int end   = road[1];
                int dis   = road[2];
                if (map.containsKey(start) || map.containsKey(end)){
                    map.put(start,true);
                    map.put(end,true);
                    res = Math.min(res,dis);
                }
            }
        }

        return res;
    }
}
