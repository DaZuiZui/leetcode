import java.util.ArrayList;
import java.util.List;

public class P1282 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        //创建hash表
        ArrayList[] hash = new ArrayList[groupSizes.length + 1];

        for (int i = 0; i < groupSizes.length; i++) {
            int key = groupSizes[i];
            if (hash[key] == null){
                hash[key] = new ArrayList<>();
            }

            hash[key].add(i);

            if (hash[key].size() == key){
                res.add(new ArrayList<>(hash[key]));
                hash[key].clear();
            }
        }

        return res;
    }
}
