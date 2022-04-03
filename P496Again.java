package leccod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class P496Again {
    public static void main(String[] args) {
        new P496Again().nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums2.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]){
                arr[stack.pop()] = nums2[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            map.put(nums2[i], arr[i]);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
