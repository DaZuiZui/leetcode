package chuanzhibei6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    static List<String> list = new ArrayList<>();
    static String explem = "";
    static Integer n ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();

        explem = scanner.next();

        dfs("",0);
        System.out.println(list.size());
    }

    public static void dfs(String str,int index){
        if (index-1 == n || str.length() > 3){
            return;
        }
        if (str.length() == 3){
            if (str.charAt(0) != str.charAt(1) && str.charAt(1) == str.charAt(2) ){
                list.add(str);
            }
            return;
        }

        for (int i = index; i < n; i++) {
            String tmp = str+explem.charAt(i);
            if (tmp.length() > 3) return;
            dfs(tmp,i+1);
        }
    }
}
