package chuanzhibei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthA = scanner.nextInt();
        int lengthB = scanner.nextInt();
        long[] arr1 = new long[lengthA];
        long[] arr2 = new long[lengthB];
        StringBuilder stringBuilder = new StringBuilder();

        List<Long> list = new ArrayList<>();

        for (int i = 0; i < lengthA; i++) {
            arr1[i] = scanner.nextLong();
        }

        for (int i = 0; i < lengthB; i++) {
            arr2[i] = scanner.nextLong();
        }

        //进位
        int curindex =0;
        long jinwei = 0;
        int indexA = lengthA-1;
        for (int i = lengthB-1; i >= 0; i--) {
            //如果数组A已经遍历完成
            if (indexA < 0){
                long tmp = arr2[i] + jinwei;
                //获取当前进制
                int jinzhicur = curindex+2;
                //需要进位的内容
                jinwei = tmp / jinzhicur;
                //需要保留的内容
                tmp = tmp % jinzhicur;

                list.add(tmp);
                //stringBuilder.append(tmp);
                //更新位数下标
                curindex++;
                continue;
            }

            //相加
            long tmp = arr2[i] + arr1[indexA--] + jinwei;
            //查看当前的进制
            int jinzhicur = curindex+2;
            //需要进位的内容
            jinwei = tmp / jinzhicur;
            //需要保留的内容
            tmp = tmp % jinzhicur;
            list.add(tmp);
            //stringBuilder.append(tmp);
            //更新位数下标
            curindex++;
        }

        //查看indexA是否遍历完成
        while (indexA >= 0){
            //进行追加
            long tmp = jinwei + arr1[indexA--];
            //获取当前进制
            int jinzhicur = curindex+2;
            //需要进位的内容
            jinwei = tmp / jinzhicur;
            //需要保留的内容
            tmp = tmp % jinzhicur;
            list.add(tmp);
            //stringBuilder.append(tmp);
            //更新位数下标
            curindex++;
        }

        while(jinwei!=0){
            long tmp = jinwei;
            int jinzhicur = curindex+2;
            if (tmp < jinzhicur){

                list.add(tmp);
                break;
            }

            //需要进位的内容
            jinwei = tmp / jinzhicur;
            //需要保留的内容
            tmp = tmp % jinzhicur;
            list.add(tmp);
            curindex++;
        }

        int n = list.size();
        for (int i = n-1; i >= 0 ; i--) {
            stringBuilder.append(list.get(i)+" ");
        }

        System.out.println(stringBuilder.toString().trim());
        scanner.close();
    }
}
