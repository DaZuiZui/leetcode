package leccod;

public class MST0810 {
    public static void main(String[] args) {

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //新值和旧值相等就没必要涂了
        if(newColor == image[sr][sc]){
            return image;
        }
        dfs(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image,int sr,int sc,int newColor,int oldColor){
        //查看是否存在越界
        if (sr >= image.length || sc >= image[0].length || sc < 0 || sr < 0 || image[sr][sc] !=oldColor){
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr-1, sc, newColor, oldColor);
        dfs(image, sr+1, sc, newColor, oldColor);
        dfs(image, sr, sc-1, newColor, oldColor);
        dfs(image, sr, sc+1, newColor, oldColor);
    }
}
