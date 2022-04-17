package leccod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class P819 {
    public static void main(String[] args) {
        System.out.println(new P819().mostCommonWord(
                "Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"bob","hit"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph.length() == 0){
            return "";
        }

        String[] arr = paragraph.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String s : banned) {
            set.add(s);
        }

        //获取字符串里面的字符
        for (int i = 0; i < paragraph.length(); i++) {
            //如果刚开始就是非字母就不执行
            if (!check(paragraph.charAt(i))){
                continue;
            }
            int start = i;
            for (int j = start; j < paragraph.length(); j++) {
                //查询当前字符
                if (!check(paragraph.charAt(j))){
                    //System.out.println(j+" "+start+" "+i+" "+paragraph.substring(start,j).toLowerCase());
                    //将字符串写入map
                    map.put(paragraph.substring(start,j).toLowerCase(),map.getOrDefault(paragraph.substring(start,j).toLowerCase(),0)+1);
                    i = j;
                    break;
                }
                if (j == paragraph.length()-1){
                    map.put(paragraph.substring(start,j+1).toLowerCase(),map.getOrDefault(paragraph.substring(start,j).toLowerCase(),0)+1);
                    i = paragraph.length();
                }
            }
        }

        int showcount =0;
        String res = "";

        for (String s : map.keySet()) {
            if (set.contains(s)) continue;
            if (map.get(s) > showcount){
                res = s;
                showcount = map.get(s);
            }
        }


        return res;
    }

    public boolean check(char c){
        //System.err.println(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' ? true : false);
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' ? true : false;
    }
}
