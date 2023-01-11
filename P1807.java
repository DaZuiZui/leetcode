import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P1807 {
    public static void main(String[] args) {
        List<List<String>> knowledge = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("bob");
        knowledge.add(list);
        List<String> list1 = new ArrayList<>();
        list1.add("age");
        list1.add("two");
        knowledge.add(list1);
        System.out.println(new P1807().evaluate("(name)is(age)yearsold", knowledge));
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = s.length();
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        //System.out.println(map);
        for (int r = 0 ,l  =0; r < n; r++) {
            char c = s.charAt(r);
            //如果不是括号
            if ( c != '('){
                stringBuilder.append(c);
            }else {
                //左指针记录括号出现的位置
                l = r;
                //寻找右括号
                while (r < n && s.charAt(r) != ')'){
                    r++;
                }

                //查看区间内容
                String tmp = s.substring(l+1, r);
                //System.out.println(tmp);
                stringBuilder.append(map.get(tmp) == null ? "?" : map.get(tmp));
            }
        }

        return stringBuilder.toString();
    }
}
