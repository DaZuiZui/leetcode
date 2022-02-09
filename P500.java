package leccod;

import java.util.*;

public class P500 {
    public static void main(String[] args) {
        System.out.println(new P500().findWords(new String[]{"Hello","Alaska","Dad","Peace"}));
    }

    public String[] findWords(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('q',1);
        map.put('w',1);
        map.put('e',1);
        map.put('r',1);
        map.put('t',1);
        map.put('y',1);
        map.put('u',1);
        map.put('i',1);
        map.put('o',1);
        map.put('p',1);

        map.put('a',2);
        map.put('s',2);
        map.put('d',2);
        map.put('f',2);
        map.put('g',2);
        map.put('h',2);
        map.put('j',2);
        map.put('k',2);
        map.put('l',2);

        map.put('z',3);
        map.put('x',3);
        map.put('c',3);
        map.put('v',3);
        map.put('b',3);
        map.put('n',3);
        map.put('m',3);

        ArrayList<String> list = new ArrayList();
        int hang =0;
        boolean b = true;


        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j) < 'a' ? (char) (words[i].charAt(j) + 32) : words[i].charAt(j);
                //查看第一个字母属于多少行
                if (j == 0){
                    hang = map.get(c);
                    continue;
                }
                //不是第一行
                if (map.get(c) != hang){
                    b= false;
                }
            }

            if (b){
                list.add(words[i]);
            }

            b = true;
            hang =0 ;
        }

        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }


        System.out.println(list);
        return str;
    }
}
