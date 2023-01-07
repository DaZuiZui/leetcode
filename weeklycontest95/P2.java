package weeklycontest95;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class P2 {
    /*
    public static void main(String[] args) {
        DataStream1 dataStream = new DataStream(2,2);
        System.out.println(dataStream.consec(5));
        System.out.println(dataStream.consec(4));
        System.out.println(dataStream.consec(1));
        System.out.println(dataStream.consec(2));
        System.out.println(dataStream.consec(2));
        System.out.println(dataStream.consec(5));


    }

*/
}

/*
class DataStream1 {
    int l = 0; //左指针
    int r = 0; //右指针
    int targer = 0;
    int k = 0;
    int length = 0;
    int last = -1;
    List<Integer> list = new ArrayList<>();
    public DataStream(int value, int k) {
        this.targer = value;
        this.k = k;
    }

    public boolean consec(int num) {
        //判断是否为首次添加
        if (r == l){
            last = num;
            r++;
            list.add(num);
            //k ==1的情况
            if (k == 1){
                l++;
                return num == targer;
            }
            if (num != targer){
                l++;
            }
            return false;
        }

        list.add(num);


        //判断下左指针和右指针是否相同
        if (num == list.get(l)){
            //判断长度是否一直
            if ( r- l + 1 == k){
                r++;
                l++;
                return true;
            }else{
                //左指针移动
                while (
                        (l < r && list.get(l) != list.get(r)) ||
                                ( l < r && list.get(l) == list.get(r) && r -l + 1 > k)
                ){
                    l++;
                }
            }
        }
        r++;
        return false;
    }
}

 */