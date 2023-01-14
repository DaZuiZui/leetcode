package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P93 {
    public static void main(String[] args) {
        System.out.println(new P93().restoreIpAddresses("000256"));
    }

    private List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        dfs(s,0,"",0);
        return res;
    }

    public void dfs(String s, int index, String cur,int number){
        //减去枝叶
        if (index > s.length() || number > 4){
            return;
        }
        //满足要求
        if (number == 4 && index == s.length()) {
            res.add(cur);
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String tmp = s.substring(index,i+1);
            //查看是否为0-256之间
            int num = Integer.valueOf(tmp);
            //查看是否0前导
            if (i+1 - index >= 2){
                if (s.charAt(index) == '0') {
                    return;
                }
            }
            //合法字段
            if (num >= 0 && num < 256){
                dfs(s,i+1,number ==3 ? cur+num : cur+num+".",number+1);
            }else{
                return;
            }
        }
    }
}
