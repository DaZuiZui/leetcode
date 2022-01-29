package leccod;

import java.util.ArrayList;
import java.util.List;

public class P085Offer {
    public static void main(String[] args) {
        System.out.println(new P085Offer().generateParenthesis(3));
    }

    List<String> list  = new ArrayList();
    public List<String> generateParenthesis(int n) {
        dfs(n,n,"");
        return list;
    }

    public void dfs(int left,int right,String str){
        if (left == 0 && right ==0){
            list.add(str);
            return;
        }

        if (left>0){
            dfs(left-1,right,str+"(");
        }

        if (right > left){
            dfs(left,right-1,str+")");
        }
    }
}
