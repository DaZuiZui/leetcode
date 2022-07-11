import java.util.ArrayList;

public class P676 {
    public static void main(String[] args) {
        String[] str = new String[]{"hello","leetcode"};
        MagicDictionary m = new MagicDictionary();
        m.buildDict(str);
        System.out.println(m.search("hello"));
        System.out.println(m.search("hhllo"));
        System.out.println(m.search("hell"));
        System.out.println(m.search("leetcoded"));
    }
}


class MagicDictionary {
    private ArrayList<String> arrayList;
    public MagicDictionary() {
        arrayList = new ArrayList<>();
    }

    public void buildDict(String[] dictionary) {
        //把dictionnary中的数据存入list集合中
        for (String s : dictionary) {
            arrayList.add(s);
        }
    }

    public boolean search(String searchWord) {
        //遍历list集合
        for (String s : arrayList) {
            boolean b = false;
            //判断长度是否与searchWord相同的
            if(s.length() == searchWord.length() && !s.equals(searchWord)){
                int different = 0;
                //查看是否匹配
                char[] chars1 = s.toCharArray();
                char[] chars2 = searchWord.toCharArray();

                for (int i = 0; i < chars2.length; i++) {
                    if (chars1[i] != chars2[i]){
                        different++;
                        if (different > 1){
                            break;
                        }
                    }
                }

                if (different == 1){
                    b = true;
                }
            }

            if (b == true){
                return b;
            }
        }
        return false;
    }
}
