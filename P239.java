package leccod;

import java.util.Deque;
import java.util.LinkedList;

public class P239 {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int indexOfRes = 0;

        LinkedList<Integer> list = new LinkedList<>();
        //初始化第一个滑动窗口
        for (int i = 0; i < k; i++) {
            while(!list.isEmpty() && list.peekLast() < nums[i]) {
                list.removeLast();
            }
            list.addLast(nums[i]);
        }

        res[indexOfRes++] = list.peekFirst();

        //滑动窗口后移动
        for (int i = k; i < nums.length; i++) {
            if(nums[i-k] == list.peekFirst()){
                list.removeFirst();
            }

            while(!list.isEmpty() && list.peekLast() < nums[i]) {
                list.removeLast();
            }

            list.addLast(nums[i]);
            res[indexOfRes++] = list.peekFirst();
        }
        return res;
    }
}
