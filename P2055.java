package leccod;

import java.util.TreeMap;

public class P2055 {
    public static void main(String[] args) {
        new P2055().platesBetweenCandles("**|**|***|",new int[][]{{2,5},{5,9}});
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        int[] res = new int[queries.length];
        int count =0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='|') {
                map.put(i,count);
            }else{
                count++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            Integer ceil  = map.ceilingKey(queries[i][0]);
            Integer floor = map.floorKey(queries[i][1]);
            System.out.println(ceil+"  "+floor);
            if (ceil == null ||floor == null|| ceil >= floor){
                res[i] = 0;
            }else{
                res[i] = map.get(floor) - map.get(ceil);
            }
        }

        return res;
    }
}
