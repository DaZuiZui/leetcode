package leccod;

import java.util.ArrayList;
import java.util.List;

public class P417 {
    public static void main(String[] args) {
        System.out.println(new P417().pacificAtlantic(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        //创建返回集合
        List<List<Integer>> res = new ArrayList<>();
        //太平洋和泰熙扬的能走的路数组
        boolean[][] PacificOceanT = new boolean[heights.length][heights[0].length];
        boolean[][] PacificOceanX = new boolean[heights.length][heights[0].length];
        //计算太平洋和太西洋能走的路 左右的
        for (int i = 0; i < heights.length; i++) {
            dfs(heights,PacificOceanT,i,0);
            dfs(heights,PacificOceanX,i,heights[0].length-1);
        }
        //计算上下的
        for (int i = 0; i < heights[0].length; i++) {
            dfs(heights,PacificOceanT,0,i);
            dfs(heights,PacificOceanX,heights.length-1 ,i);
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (PacificOceanT[i][j] && PacificOceanX[i][j]){
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }

        return res;
    }

    public void dfs(int[][] heights,boolean[][] array,int i,int j){

        //如果当前的路走过返回直接返回
        if (array[i][j] == true) {
            return;
        }
        //如果当前路没走过标记为走过
        array[i][j] = true;
        //查看可以不可以往上走
        if (i - 1 >= 0 && heights[i-1][j] >= heights[i][j]){
            dfs(heights,array,i-1,j);
        }
        //查看是否可以往下走
        if (i + 1 < heights.length && heights[i+1][j] >= heights[i][j]){
            dfs(heights,array,i+1,j);
        }
        //判断是否可以向左走
        if (j - 1 >= 0 && heights[i][j-1] >= heights[i][j]){
            dfs(heights,array,i,j-1);
        }
        //判断是否可以向右走
        if(j+1 < heights[0].length && heights[i][j+1]>=heights[i][j]){
            dfs(heights,array,i,j+1);
        }

    }
}
