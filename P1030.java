import java.util.PriorityQueue;

public class P1030 {
    public static void main(String[] args) {
        System.out.println(new P1030().allCellsDistOrder(2, 2, 0, 1));
    }

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows*cols][2];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b)->{
            int dis1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int dis2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return dis1 - dis2;
        });

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                priorityQueue.add(new int[]{i,j});
            }
        }

        int index =0;
        while (!priorityQueue.isEmpty()) {
            int[] poll = priorityQueue.poll();
            System.out.println(poll[0]+"and"+poll[1]);
            res[index][0] = poll[0];
            res[index++][1] = poll[1];
        }


        return res;
    }
}
