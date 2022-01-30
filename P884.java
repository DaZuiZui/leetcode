package leccod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P884 {
    public static void main(String[] args) {
        new P884().uncommonFromSentences("this apple is sweet","this apple is sour");
    }

    Map<String,Integer> map  =new HashMap<>();
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        //数组A
        for (int i = 0; i < str1.length; i++) {
            if (map.containsKey(str1[i])){
                map.put(str1[i],map.get(str1[i])+1);
                continue;
            }
                map.put(str1[i],1);
        }

        //数组B
        for (int i = 0; i < str2.length; i++) {
            if (map.containsKey(str2[i])){
                map.put(str2[i],map.get(str2[i])+1);
                continue;
            }
            map.put(str2[i],1);
        }

        List<String> list=  new ArrayList<>();
        //遍历只出现过一次的字符串
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }
        String[] returnString = new String[list.size()];
        for (int i = 0; i < returnString.length; i++) {
            returnString[i] = list.get(i);
        }

        System.out.println(list);
        return returnString;
    }
}
