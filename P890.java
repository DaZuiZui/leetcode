package leccod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P890 {
    public static void main(String[] args) {

    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            //判断长度是否匹配
            if (word.length() != pattern.length()){
                continue;
            }
            if (match(word,pattern) && match(pattern,word)) {
                res.add(word);
            }

        }

        return res;
    }

    public boolean match(String word,String pattern){
        Map<Character,Character> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char k = word.charAt(i);
            char v = pattern.charAt(i);
            if (!map.containsKey(k)){
                map.put(k,v);
            }else if (map.get(k) != v){
                return false;
            }
        }
        return true;
    }
}
