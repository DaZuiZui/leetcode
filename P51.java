import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P51 {
    public static void main(String[] args) {
        System.out.println(new P51().solveNQueens(4));
    }

    List<List<String>> res = new ArrayList<>();
    List<String> tmp = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for (char[] chars : arr) {
            Arrays.fill(chars,'.');
        }
        dfs(arr,0,n);
        return res;
    }

    public void dfs(char[][] arr,int row,int n){
        if (row == n){
            //to do 把arr转换为list集合
            res.add(arrofchartolist(arr));
            return;
        }

        for (int i = 0; i < n; i++) {
            //查看当前位置是否可以存放
            if (!check(row,i,arr)){
                continue;
            }
            //设置皇后坐标
            arr[row][i] ='Q';
            dfs(arr,row+1,n);
            //撤销
            arr[row][i] = '.';
        }

    }

    public List<String> arrofchartolist(char[][] arr){
        List<String> list = new ArrayList<>();

        for (char[] c : arr) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }


    public boolean check(int y,int x,char[][] b){
        //判断竖着的是否可以放
        for (int i = 0; i < b.length; i++) {
            if (b[i][x] == 'Q') {
                return false;
            }
        }
        //判断斜着是否有皇后
        //从中心到左上角
        int tmpy = y;
        int tmpx = x;
        while (tmpy >= 0 && tmpx >= 0){
            if (b[tmpy][tmpx] == 'Q') {
                return false;
            }
            tmpx--;
            tmpy--;
        }
        //从中心到右下角
        tmpy = y;
        tmpx = x;
        while (tmpx < b[0].length && tmpy < b.length){
            if (b[tmpy][tmpx] == 'Q') {
                return false;
            }
            tmpx++;
            tmpy++;
        }
        //从中心到左下角
        tmpy = y;
        tmpx = x;
        while(tmpy < b.length && tmpx >= 0){
            if (b[tmpy][tmpx] == 'Q') {
                return false;
            }
            tmpx--;
            tmpy++;
        }
        tmpy = y;
        tmpx = x;
        //从中心到右上角
        while(tmpy >= 0 && tmpx < b[0].length){
            if (b[tmpy][tmpx] == 'Q') {
                return false;
            }
            tmpx++;
            tmpy--;
        }
        return true;
    }
}
