package leccod;

import lancup.lancup2021.A;

import java.lang.reflect.Array;
import java.util.*;

public class P30 {
    public static void main(String[] args) {
        System.out.println("返回结果"+new P30().findSubstring(
                "barfoothefoobarman", new String[]{
                        "bar","foo"}));
    }

    ArrayList<Integer> returnList = new ArrayList();
    public List<Integer> findSubstring(String s, String[] words) {
        //特殊情况
        if (s.length() == 0 || words.length == 0){
            return returnList;
        }

        for (int i = 0; i < s.length(); i++) {
            List<String> list = new ArrayList();
            for (String str : words){
                list.add(str);
            }

            if (i+words[0].length()* words.length > s.length()){
                break;
            }
            //6个长度得字符串为一组
            String str = s.substring(i,i+words[0].length()* words.length);

            for (int j = 0; j < str.length() ; j+=words[0].length()) {
                if (list.contains(str.substring(j,j+words[0].length()))){
                    list.remove(str.substring(j,j+words[0].length()));
                }else{
                    break;
                }
            }

            if (list.size() == 0){
                returnList.add(i);
            }

        }

        return returnList;
    }
}
