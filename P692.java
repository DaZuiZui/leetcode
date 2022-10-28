import java.util.*;

public class P692 {
    public static void main(String[] args) {
        new P692().topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding","a","a"},2);
    }

    class Entry{
        String key;

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }

        int  value;
    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String,Entry> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            Entry entry = new Entry();
            if (map.containsKey(words[i])){
                entry = map.get(words[i]);
                entry.value++;
            }else{
                entry.value++;
                entry.key = words[i];
            }

            map.put(words[i],entry);
        }


        PriorityQueue<Entry> priorityQueue = new PriorityQueue<>((a,b)->{
            if (b.value != a.value){
                return  b.value-a.value;
            }
            return a.key.compareTo(b.key);
        });

        for (Map.Entry<String, Entry> stringEntryEntry : map.entrySet()) {
            priorityQueue.offer(stringEntryEntry.getValue());

        }

        for (int i = 0; i < k; i++) {
            list.add(priorityQueue.poll().key);
        }


        return list;
    }
}
