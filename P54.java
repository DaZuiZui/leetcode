import java.util.ArrayList;
import java.util.List;

public class P54 {
    public static void main(String[] args) {
        System.out.println(new P54().spiralOrder(new int[][]{
                {1, 2, 3,4}, {5, 6,7,8}, {9,10,11,12}
        }));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int tl = 0,bl = n-1;
        int ll = 0,rl = m-1;

        while (tl <= bl || ll <= rl){
            for (int i = ll; i <= rl ; i++) {
                res.add(matrix[tl][i]);
            }
            tl++;
            if (ll > rl){
                break;
            }
            for (int i = tl; i <= bl ; i++) {
                res.add(matrix[i][rl]);
            }
            rl--;
            if (tl > bl){
                break;
            }
            for (int i = rl; i >= ll ; i--) {
                res.add(matrix[bl][i]);
            }
            bl--;
            if (ll > rl )break;
            for (int i = bl; i >= tl ; i--) {
                res.add(matrix[i][ll]);
            }
            ll++;
            if (tl > bl) break;
        }

        return res;
    }
}
