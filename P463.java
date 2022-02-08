package leccod;

public class P463 {
    public static void main(String[] args) {

    }

    public int islandPerimeter(int[][] grid) {
        int p = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] ==1){
                    //判断左面是否拥有方块
                    if (j-1>=0 && grid[i][j-1] !=1 ){
                        p++;
                    }else if (j-1 < 0){
                        p++;
                    }

                    //判断上面是否有方块
                    if (i-1>=0 && grid[i-1][j] != 1){
                        p++;
                    }else if (i-1 < 0){
                        p++;
                    }

                    //判断右边是否有方块
                    if (j+1 < grid[i].length && grid[i][j+1] != 1){
                        p++;
                    }else if (j+1 >= grid[i].length){
                        p++;
                    }

                    //判断下面是否有方块
                    if (i+1 < grid.length && grid[i+1][j] != 1){
                        p++;
                    }else if (i+1 >= grid.length){
                        p++;
                    }
                }
            }
        }
        return p;
    }
}
