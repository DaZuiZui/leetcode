import java.util.Stack;

public class P946 {
    public static void main(String[] args) {

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0,j = 0 ; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && popped[j] == stack.peek()){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
