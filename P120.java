package leccod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120 {
    public static void main(String[] args) {
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list1.add(new ArrayList<>(list));
        list.clear();
        list.add(3);
        list.add(4);
        list1.add(new ArrayList<>(list));
        list.clear();
        list.add(6);
        list.add(5);
        list.add(7);
        list1.add(new ArrayList<>(list));
        list.clear();
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(3);
        list1.add(new ArrayList<>(list));
        list.clear();

        new P120().minimumTotal(list1);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1){
            return triangle.get(0).get(0);
        }

        //获取金字塔上面的部分
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            //三角第一位
            dp[i][0] = triangle.get(i).get(0) + dp[i-1][0];

            for (int j = 1; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i-1][j-1] + triangle.get(i).get(j),
                        dp[i-1][j] + triangle.get(i).get(j))  ;
            }
            //三角最后一位
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }

        Arrays.sort(dp[triangle.size()-1]);

        return dp[triangle.size()-1][0];
    }
}
