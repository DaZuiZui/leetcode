package leccod;

import java.util.Arrays;
import java.util.List;

public class P100Offer {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            //下标为1的处理方法
            dp[i][0] = dp[i-1][0] +  triangle.get(i).get(0);
            for (int j = 1; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(triangle.get(i).get(j) + dp[i-1][j] ,
                                    triangle.get(i).get(j) + dp[i-1][j-1]);
            }
            //三角形最后一位
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }

        Arrays.sort(dp[triangle.size()-1]);
        System.out.println(dp[triangle.size()-1][triangle.get(triangle.size()-1).size()-1]);

        return 0;
    }
}
