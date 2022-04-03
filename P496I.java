package leccod;

import java.util.*;

public class P496I {
    public static void main(String[] args) {
        new P496I().nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while(!stack.empty() && nums2[i] > stack.peek()){
                map.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        while(!stack.empty()){
            map.put(stack.pop(),-1);
        }

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}
