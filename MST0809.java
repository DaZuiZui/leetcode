package leccod;

import java.util.ArrayList;
import java.util.List;

public class MST0809 {
    public static void main(String[] args) {
        new MST0809().generateParenthesis(3);
    }
    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        help(n,n,"");
        System.out.println(list);
        return list;
    }

    public  void help(int left,int right,String str){
        if (left == 0 && right== 0){
            list.add(str);
            return;
        }

        if (left > 0){
            help(left-1,right,str+"(");
        }

        if (right > left){
            help(left,right-1,str+")");
        }
    }
}
