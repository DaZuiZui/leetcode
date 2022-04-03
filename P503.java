package leccod;

import java.util.Arrays;
import java.util.Stack;

public class P503 {
    public static void main(String[] args) {

    }

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length*2-1; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length]){
                res[stack.pop()] =nums[i% nums.length];
            }
            stack.push(i % nums.length);
        }
        return res;
    }
}
