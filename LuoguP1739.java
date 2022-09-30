import java.util.Scanner;
import java.util.Stack;

public class LuoguP1739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '@'){
                break;
            }

            if (chars[i] == '('){
                stack.push('(');
            }else if (chars[i] == ')'){
                if (stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()){
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}
