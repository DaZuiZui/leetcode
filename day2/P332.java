package day2;

import java.util.*;

public class P332 {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        tmp.add("JFK");
        tmp.add("KUL");
        list.add(new ArrayList<>(tmp));
        tmp.clear();
        tmp.add("JFK");
        tmp.add("NRT");
        list.add(new ArrayList<>(tmp));
        tmp.clear();
        tmp.add("NRT");
        tmp.add("KUL");
        list.add(new ArrayList<>(tmp));

        System.out.println(new P332().findItinerary(list));
       // System.out.println(new P332().sum("KUL"));
        //System.out.println(new P332().sum("NRT"));
    }

    List<String> res = new ArrayList<>();
    HashMap<String,PriorityQueue<String>> map = new HashMap<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String key = ticket.get(0);
            String val = ticket.get(1);
            if (!map.containsKey(key)){
                PriorityQueue<String> queue = new PriorityQueue<>();
                map.put(key,queue);
            }
            map.get(key).add(val);
        }

        //System.out.println(map);
        dfs("JFK");
        return res;
    }

    public void dfs(String key){
        PriorityQueue<String> queue = map.get(key);

        while (queue != null && !queue.isEmpty()){
            dfs(queue.poll());
        }

        res.add(0,key);
    }
}
