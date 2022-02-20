package leccod;

public class P11 {
    public static void main(String[] args) {
        System.out.println(new P11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int l = 0,r = height.length-1,max = 0;
        while (l < r){
            //计算高
            int h = Math.min(height[l],height[r]);
            int w = r-l;

            max = Math.max(max,h*w);

            if (height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
    }
}
