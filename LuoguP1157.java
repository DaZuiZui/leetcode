package luogu;

import java.util.Scanner;

public class LuoguP1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long r = scanner.nextLong();
        bfs(n,r,1,0,"");
    }

    public static void bfs(long n,long r,long start,long cur,String str){
        //长度已经到了r
        if (cur == r){
            System.out.println(str);
            return;
        }

        for (long i = start; i <= n ; i++) {
            if (i < 10){
                bfs(n,r,i+1,cur+1,str + "  "+i);
            }else {
                bfs(n,r,i+1,cur+1,str + " "+i);
            }
        }
    }
}
