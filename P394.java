import java.util.Stack;

public class P394 {
    public static void main(String[] args) {
        System.out.println(new P394().decodeString("100[leetcode]"));
    }

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            if (chars[i] != ']'){
                stack.push(chars[i]);
            }else{
                StringBuilder string = new StringBuilder();
                while (stack.peek() != '['){
                    string.append(stack.pop());
                }
                //弹出【
                stack.pop();
                StringBuilder num = new StringBuilder();
                //记录出现的次数
                while (!stack.isEmpty() && checkNum(stack.peek())){
                    num.append(stack.pop());
                }
                num.reverse();
                Integer integer = Integer.valueOf(num.toString());
                string = string.reverse();
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < integer; j++) {
                    tmp.append(string);
                }
                if (!stack.isEmpty()){
                    for (char c : tmp.toString().toCharArray()) {
                        stack.add(c);
                    }
                }else{
                    res.append(tmp);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty())
            stringBuilder.append(stack.pop());

        res.append(stringBuilder.reverse());
        return res.toString();
    }

    public  boolean checkNum(Character num){
        return num >= '0' && num <= '9';
    }
}
