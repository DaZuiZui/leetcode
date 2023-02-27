import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P981 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.floorEntry(3);
    }

    class TimeMap {
        HashMap<String, TreeMap<Integer,String >> map = new HashMap<>();
        public TimeMap() {

        }

        public void set(String key, String value, int timestamp) {
            TreeMap<Integer,String > tmp = new TreeMap<>();
            if (map.get(key) == null){
                tmp.put(timestamp,value);
                map.put(key,tmp);
            }else {
                TreeMap<Integer, String> integerStringTreeMap = map.get(key);
                integerStringTreeMap.put(timestamp,value);
                map.put(key,integerStringTreeMap);
            }

        }

        public String get(String key, int timestamp) {
            TreeMap<Integer, String> integerStringTreeMap = map.get(key);
            Map.Entry<Integer, String> integerStringEntry = integerStringTreeMap.floorEntry(timestamp);
            if (integerStringEntry == null) return "";
            return integerStringEntry.getValue();
        }
    }

}
