package leccod;

public class MST1721 {
    public static void main(String[] args) {
        System.out.println(new MST1721().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public int trap(int[] height) {
        if (height.length ==0){
            return 0;
        }
        char a = 67;
        int max = 0 ;//用来存放水的数量
        int lrp[] = new int[height.length];
        lrp[0]    = height[0];
        int rrp[] = new int[height.length];
        rrp[height.length-1]    = height[height.length-1];

        //从左侧开始遍历
        for (int i = 1; i < height.length; i++) {
            lrp[i] = Math.max(height[i],lrp[i-1]);
        }

        for (int i = height.length - 2; i >= 0 ; i--) {
            rrp[i] = Math.max(rrp[i+1],height[i]);
        }

        //开始计算积水量
        for (int i = 0; i < height.length; i++) {
            max += Math.min(lrp[i],rrp[i]) - height[i];
        }


        return max;
    }
}
