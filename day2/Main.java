package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<List<String>> res = new ArrayList<>();
    private static boolean button = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 24;
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //保证一个数字只能用一次
        boolean[] b = new boolean[4];
        dfs(arr,target,0,0,new LinkedList<>(),b,new LinkedList<>());
        if (res.isEmpty()){
            System.out.println("no anwser");
        }else{
            List<String> list = res.get(0);
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    public static void dfs(int[] arr, int targer, int sum, int index, LinkedList<String> list,boolean[] b,LinkedList<Integer> step){
        if (button){
            return;
        }
        if (sum == targer && list.size() == 3){
            //System.out.println(sum+" and "+targer);
            button = true;
            res.add(new LinkedList<>(list));
            return;
        }

        for (int i = 0; i < 4; i++) {
            //检测是否使用过
            if (b[i] == true){
                continue;
            }
            b[i] = true;
            //假设作为加法的情况
            if (step.isEmpty()){
                //list.addLast(arr[i]+" + ");
                step.add(arr[i]);
            }else{
                //list.removeLast();
                list.addLast( arr[i]+" + "+step.getLast()+" = "+(arr[i]+step.getLast()));
                step.add(arr[i]+step.getLast());
            }
            dfs(arr,targer,sum+arr[i],index+1,list,b,step);
            if (!list.isEmpty())
                list.removeLast();
            if (!step.isEmpty())
                step.removeLast();


            //假设作为减法法的情况
            if (step.isEmpty()){
                //list.addLast(arr[i]+" + ");
                step.add(arr[i]);
            }else{
                //list.removeLast();
                list.addLast(step.getLast()+" - "+arr[i]+" = "+(step.getLast() - arr[i]));
                step.add(step.getLast() - arr[i]);
            }
            dfs(arr,targer,list.isEmpty() ? arr[i] : sum-arr[i],index+1,list,b,step);
            if (!list.isEmpty())
                list.removeLast();
            if (!step.isEmpty())
                step.removeLast();

            //假设作为乘法法法的情况
            if (step.isEmpty()){
                //list.addLast(arr[i]+" + ");
                step.add(arr[i]);
            }else{
                //list.removeLast();
                list.addLast(step.getLast()+" * "+arr[i]+" = "+(step.getLast() * arr[i]));
                step.add(step.getLast() * arr[i]);
            }
            dfs(arr,targer,list.isEmpty() ? arr[i] : sum*arr[i],index+1,list,b,step);
            if (!list.isEmpty())
                list.removeLast();
            if (!step.isEmpty())
                step.removeLast();

            //假设作为除法法法的情况
            if (step.isEmpty()){
                //list.addLast(arr[i]+" + ");
                step.add(arr[i]);
            }else{
                //判断除法是否不合法
                if (step.getLast() < arr[i]){
                    b[i] = false;
                    return;
                }
                //list.removeLast();
                list.addLast(step.getLast()+" / "+arr[i]+" = "+(step.getLast() / arr[i]));
                step.add(step.getLast() / arr[i]);
            }
            dfs(arr,targer,list.isEmpty() ? arr[i] : sum/arr[i],index+1,list,b,step);
            if (!list.isEmpty())
                list.removeLast();
            if (!step.isEmpty())
                step.removeLast();

            b[i] = false;
        }
    }
}
