import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P460 {
    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(2,1);
        lfuCache.put(3,2);
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(2));
        lfuCache.put(4,3);
        System.out.println(lfuCache.get(2));


    }
}

class LFUCache {
    //用来保存k v
    private Map<Integer,Integer> map = new HashMap<>();
    private List<Integer> list = new ArrayList<>();
    int times = 0; //当前的时间
    private Map<Integer,Integer> tmap = new HashMap<>(); //当前的key的使用时间
    private Map<Integer,Integer> timess = new HashMap<>(); //使用的次数
    private int size = 0;
    public LFUCache(int capacity) {
        this.size = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        timess.put(key,timess.get(key)+1);
        tmap.put(key,times++);
        return map.get(key);
    }

    public void put(int key, int value) {
        //没有空间的情况
        if (size ==0){
            return;
        }
        //判断key是否存在
        if (map.containsKey(key)){
            map.put(key,value);
            timess.put(key,timess.getOrDefault(key,0)+1);
            return;
        }

        //判断容量大小是否大于size
        if (list.size() >= size){
            //查找最不常用的元素
            list.sort((a,b) ->{
                return timess.get(a) - timess.get(b);
            });
            //System.out.println(list);
            //删除并列元素
            int index =0;
            //使用的次数的标准
            int bz    = timess.get(list.get(index));
            int deleteID = Integer.MAX_VALUE;
            int bztime = Integer.MAX_VALUE; //标准使用次数
            while(true){

                if (index == list.size()){
                    break;
                }
               //System.out.println(bz +"and"+timess.get(list.get(index)));
                if (bz != timess.get(list.get(index))){
                    break;
                }

                if (tmap.get(list.get(index)) < bztime){
                    deleteID = index;
                    bztime = tmap.get(list.get(index));
                }
                index++;
            }

            //删除多余的
            Integer num = list.remove(deleteID);
            map.remove(num);
            tmap.remove(num);
            timess.remove(timess);


        }

        list.add(key);
        map.put(key,value);
        tmap.put(key,times);
        timess.put(key,1);
        times++;
        //System.err.println(list);
    }
}
