package weeklycontest95;

import java.util.ArrayList;
import java.util.List;

public class P2Again {
    public static void main(String[] args) {
        DataStream dataStream = new DataStream(2,2);
        System.out.println(dataStream.consec(5));
        System.out.println(dataStream.consec(4));
        System.out.println(dataStream.consec(1));
        System.out.println(dataStream.consec(2));
        System.out.println(dataStream.consec(2));
        System.out.println(dataStream.consec(5));
    }
}

class DataStream {
    int targer = 0;
    int k = 0;
    int count = 0;
    public DataStream(int value, int k) {
        this.targer = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if (num == targer){
            count++;
        }else{
            count = 0;
        }

        if (count >= k){
            return true;
        }

        return false;
    }
}