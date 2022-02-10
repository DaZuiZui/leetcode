package leccod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P1447 {
    public static void main(String[] args) {
        System.out.println(new P1447().simplifiedFractions(6));
    }

    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        HashMap<Double,Integer> map = new HashMap<>();
        //生成分母小于等于n的数字
        //分母不可以为1
        for (int i = 2; i <= n; i++) {
            //生成分子小于等于i的数字
            for (int j = 1; j < i; j++) {
                //分子等于1的时候
                if (j ==1) {
                    list.add(j+"/"+i);
                    continue;
                }

                //当分子不为1的时候
                if (i % j != 0 ) {
                    double a = i;
                    double b = j;
                    //System.out.println(b+"/"+a+"="+b/a);
                    if (!map.containsKey(b/a)){
                        list.add(j+"/"+i);
                        map.put(b/a,1);
                    }

                }
            }
        }

        return list;
    }
}
