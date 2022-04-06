package leccod;

import java.util.LinkedList;

public class Offer59I {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        //非空判断
        if (nums.length == 0 || k ==0){
            return new int[0];
        }
        int[] res = new int[nums.length-1];
        int resindex =0;
        LinkedList<Integer> que = new LinkedList<>();
        //初始化第一个滑动窗口
        for (int i = 0; i < k; i++) {
            if (!que.isEmpty() && que.peekLast() < nums[i]){
                que.removeLast();
            }

            que.addLast(nums[i]);
        }
        res[resindex++] = que.peekFirst();

        //滑动窗口后移
        for (int i = k; i < nums.length; i++) {
            //如果元素与第一位相等
            while(!que.isEmpty() && que.peekFirst() == nums[i]){
                que.removeFirst();
            }

            while (!que.isEmpty() && que.peekLast() < nums[i]){
                que.removeLast();
            }

            que.addLast(nums[i]);
            res[resindex++] = que.peekFirst();
        }

        return res;
    }
}
