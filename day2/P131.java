package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P131 {
    public static void main(String[] args) {
        System.out.println(new P131().partition("aab"));
    }
    private List<List<String>>  res = new ArrayList<>();
    
    public List<List<String>> partition(String s) {
        dfs(s,0,new LinkedList<>());
        return res;
    }

    public void dfs(String str, int index, LinkedList<String> list){
        //找到了
        if (index >= str.length()){
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < str.length(); i++) {
            //判断是否为回文
            if (isPalindrome(str.substring(index,i+1))){
                list.add(str.substring(index,i+1));
            }else{
                continue;
            }

            //起始位置后移动
            dfs(str, i+1, list);
            list.removeLast();
        }
    }

    public boolean isPalindrome(String str){
        int l = 0,r = str.length()-1;
        while (l < r){
            if (str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
