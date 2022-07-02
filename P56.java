import java.util.ArrayList;
import java.util.Arrays;
public class P56 {
    public static void main(String[] args) {
        new P56().merge(
                new int[][]{
                        {2,3},{4,5}
                }
        );
    }

    public int[][] merge(int[][] intervals) {
        int[][] res = new int[intervals.length][2];
        //确保了所有数组按照下表0的顺序排序
        Arrays.sort(intervals,(arr1,arr2)->{
            return arr1[0] - arr2[0];
        });

        int index = -1;
        for (int[] interval : intervals) {
            if(index == -1 || interval[0] > res[index][1]){
                res[++index] = interval;
            }else{
                res[index][1] = Math.max(res[index][1],interval[1]);
            }
        }

        return Arrays.copyOf(res,index+1);
    }
}
