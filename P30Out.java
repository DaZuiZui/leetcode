package leccod;

import java.util.*;

public class P30Out {


    public static void main(String[] args) {
        new P30Out().findSubstring("foobarfoobar", new String[]{
                "foo","bar"});
    }
    List<Integer> returnList = new ArrayList<Integer>();
    List<String> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    public List<Integer> findSubstring(String s, String[] words) {
        //非空判断
        if (s == null || words == null){
            return returnList;
        }

        boolean[] b = new boolean[words.length];
        help(words,0,new StringBuilder(),b);

        StringBuilder stringBuilder = new StringBuilder(s);

        for (int j = 0; j < list.size(); j++) {
            if (stringBuilder.indexOf(list.get(j)) == -1){
                continue;
            }

            for (int i = 0 ; i < s.length(); ) {

                //直接指定到指定位置
                i = stringBuilder.indexOf(list.get(j));
                if (i == -1){
                    break;
                }




                if (stringBuilder.indexOf(list.get(j)) >= 0){
                    //System.out.println(stringBuilder+"看list指定位置"+list.get(j)+"发现的位置在"+i);
                    int chawei = s.length() -stringBuilder.length();
                    set.add(i+chawei);
                }

                //截取字符串
                stringBuilder = new StringBuilder(stringBuilder.substring(i+1,stringBuilder.length()));
            }
            stringBuilder = new StringBuilder(s);
        }

        returnList.addAll(set);
        return returnList;
    }



    //查看所有可形成的类型
    public void help(String[] words,int start,StringBuilder str,boolean[] b){
        if (words.length == start){
            list.add(str.toString());
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (b[i] == true){
                continue;
            }
            b[i] = true;
            help(words,start+1,new StringBuilder(str+""+words[i]),b);
            b[i] = false;
        }
    }
}
