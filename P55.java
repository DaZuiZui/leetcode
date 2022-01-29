package leccod;


public class P55 {
    public static void main(String[] args) {
        System.out.println(new P55().canJump(new int[]{2,0,0}));
    }


    /**
     * 思路：
     *      max 存放最大可走的路线
     *     判断当前下标的值 + i  i代表已经走了多少步，
     *     每次循环都毒判断下上面俩个元素的谁大，大的给max，
     *     如果max == nums.leng -1那么就返回true
     */
    public boolean canJump(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
           if (max == nums.length-1){
               return true;
           }

           max = Math.max(max,nums[i] + i);
        }

        return false;
    }
}
