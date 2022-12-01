package y51288033outlook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1779 {
    public static void main(String[] args) {


        System.out.println(new P1779().nearestValidPoint(3, 4, new int[][]{{2, 3}}));
    }

    class Entry{
        int id;
        int val;

        @Override
        public String toString() {
            return "Entry{" +
                    "id=" + id +
                    ", val=" + val +
                    '}';
        }
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int res = -1;
        List<Entry> list = new ArrayList<>();

        int index =0;
        for (int[] point : points) {
            int x1 = point[0];
            int y1 = point[1];
            if (x1 == x || y1 == y){
                int abs = Math.abs(x - x1) + Math.abs(y - y1);
                Entry entry = new Entry();
                entry.id  = index;
                entry.val = abs;
                list.add(entry);
            }
            index++;
        }
        list.sort((a,b)->{
            if (a.val > b.val){
                return 1;
            }
            return -1;
        });
        if (list.isEmpty()){
            return -1;
        }
        Entry entry = list.get(0);
        res = entry.id;
        int n = list.size();
        for (int i = 1; i < n; i++) {
            if (list.get(i).val != entry.val){
                break;
            }

            res = Math.min(res,list.get(i).id);
        }

        return res;
    }
}
