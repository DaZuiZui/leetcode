import java.util.Arrays;

public class P57 {
    public static void main(String[] args) {
        new P57().insert(new int[][]
                {
                        {1,3},
                        {6,9}
                },new int[]{2,3});
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length+1][2];
        int length = intervals.length;
        //将2个数组合并成一个
        for (int i = 0; i < length; i++) {
            res[i] = intervals[i];
        }
        res[length] = newInterval;

        //保证左区间按照从小到大的方式排序
        Arrays.sort(res,(arr1,arr2)->{
            return arr1[0] - arr2[1];
        });

        int[][] end = new int[res.length][2];
        int index = -1;

        for (int[] ints : res) {
            if (index == -1 || ints[0] > end[index][1]){
                end[++index] = ints;
            }else{
                end[index][1] = Math.max(end[index][1],ints[1]);
            }
        }
        return Arrays.copyOf(end,index+1);
    }
}
