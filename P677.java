import java.util.HashMap;
import java.util.Map;

public class P677 {
    public static void main(String[] args) {

    }
}

class MapSum {
    Map<String,Integer> map ;

    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int res = 0;
        for (Map.Entry<String, Integer> tmp : map.entrySet()) {
            if (tmp.getKey().startsWith(prefix)){
                res += tmp.getValue();
            }
        }

        return res;
    }
}
