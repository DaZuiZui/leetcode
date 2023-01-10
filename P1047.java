import java.util.Stack;

public class P1047 {
    public static void main(String[] args) {
        System.out.println(new P1047().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for (int i = 0; i <n ; i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{
                if (stack.peek() == s.charAt(i)){
                    stack.pop();
                    continue;
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}
