import java.util.Stack;

public class P150 {
    public static void main(String[] args) {
        System.out.println(new P150().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String tmp = tokens[i];
            //遇见+的时候
            if (tmp.equals("+")){
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a1+a2);
            }
            //遇见-的时候
            else if (tmp.equals("-")){
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2-a1);
            }
            //遇见/的时候
            else if (tmp.equals("/")){
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a2/a1);
            }
            //遇见*的时候
            else if (tmp.equals("*")){
                int a1 = stack.pop();
                int a2 = stack.pop();
                stack.push(a1*a2);
            }
            //遇见数字的情况
            else {
                stack.push(Integer.valueOf(tmp));
            }
        }

        return stack.pop();
    }
}
