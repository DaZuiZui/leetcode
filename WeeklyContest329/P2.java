package WeeklyContest329;

import java.util.*;

public class P2 {
    public static void main(String[] args) {
        int[][] ints = new P2().sortTheStudents(
                new int[][]{
                        {10, 6, 9, 1},
                        {7, 5, 11, 2},
                        {4, 8,3, 5}
                }, 2
        );

        //System.out.println(ints);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i +" ");
            }
            System.out.println();
        }

    }

    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score[0].length;
        int n = score.length;
        PriorityQueue<int[]> map = new PriorityQueue<>((a,b)->{
            return b[k] - a[k];
        });
        for (int[] ints : score) {
            map.add(ints);
        }

        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            res[i] = map.poll();
        }

        return res;
    }
}
