import java.util.Stack;

public class Offer31 {
    public static void main(String[] args) {
        System.out.println(new Offer31().validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3 ,5,1,2}));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            //查看是否需要弹出
            while (!stack.isEmpty() && stack.peek() == popped[index]){
                index++;
                stack.pop();
            }
        }

        return index == popped.length;
    }
}

