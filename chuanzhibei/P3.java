package chuanzhibei;

import java.util.*;

public class P3 {

    private static long  res = Long.MAX_VALUE;
    private static long maxcount = 0;

    private static int listn = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        maxcount = m;
        listn =n;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLong());
        }
        list.sort((b,a)->{
            if (b > a){
                return 1;
            }
            return -1;
        });

        dfs(0,list);
        System.out.println(res);
    }

    public static void dfs(int count,List<Long> tmplist){
        if (count > maxcount){
            return;
        }

        LinkedList<Long> list1 = new LinkedList(tmplist);

        //移除最小位获取最大位
        long tmpfirst = list1.get(0);
        long tmplasg = list1.get(listn-1);

        //更新返回值
        res = Math.min(res,tmplasg - tmpfirst);

        //删除最小的 增加最大的
        list1.removeFirst();
        list1.offerLast(tmplasg);
        dfs(count+1,new LinkedList<>(list1));
        /**
         * 复原
         */
        list1.removeLast();
        list1.offerFirst(tmpfirst);
        //删除最大的存入最小的
        list1.removeLast();
        list1.offerFirst(tmpfirst);
        dfs(count+1,new LinkedList<>(list1));
    }
}
