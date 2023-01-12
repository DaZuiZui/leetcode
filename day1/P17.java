package day1;

import java.util.ArrayList;
import java.util.List;

public class P17 {
    public static void main(String[] args) {
        System.out.println(new P17().letterCombinations(""));
    }

    List<String> res = new ArrayList<>();
    String[] arr = new String[]{
            "","",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return res;
        }
        bfs(digits,"",0);
        return res;
    }

    public void bfs(String digits,String str,int index){
        //剪枝
        if (str.length() == digits.length()){
            res.add(str);
            return;
        }

        //获取指定按键字符
        int tmpindex = digits.charAt(index)- '0';
        String tmpstr = arr[tmpindex];
        int n = tmpstr.length();
        for (int i = 0; i < n; i++) {
            bfs(digits,str+tmpstr.charAt(i),index+1);
        }
    }
}
