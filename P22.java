package leccod;

import java.util.ArrayList;
import java.util.List;

public class P22 {

    public static void main(String[] args) {
        System.out.println(new P22().generateParenthesis(3));
    }

    List<String> arrayList = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        help(n,n,"");
        return arrayList;
    }

    public void help(int l,int r,String str){
        //所有数据都使用完毕
        if (l == 0 && r == 0){
            arrayList.add(str);
            return;
        }

        //如果左括号还有使用机会
        if (l > 0){
            help(l-1,r,str+"(");
        }

        //如果右括号还有使用机会
        if (r > l){
            help(l,r-1,str+")");
        }

    }
}
