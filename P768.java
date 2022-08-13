import java.util.Stack;

public class P768 {
    public static void main(String[] args) {
        new P768().maxChunksToSorted(new int[]{2,1,3,4,4});
    }


    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            //如果栈为null，那么默认第一个元素为最大的元素
            //或者当前的num 大于等于栈的peek那么就只会存入栈
            if (stack.isEmpty() || num >= stack.peek()){
                stack.push(num);
            }else{
                int max = stack.pop();
                while (! stack.isEmpty() && stack.peek() > num){
                    stack.pop();
                }

                stack.pop();
            }
        }

        return stack.size();
    }
}
