import java.util.Stack;

public class MST1626 {
    public static void main(String[] args) {
        System.out.println(new MST1626().calculate("11+10/2"));
    }
    
    private Stack<Integer> stack ;
    public int calculate(String s) {
        s = s.trim();
        stack = new Stack<>();
        char[] chars = s.toCharArray();
        int num =0;
        int res = 0;
        char pre = '+';
        int index =0 ;
        int n = s.length();
        for (char aChar : chars) {
            index++;
            //判断是否为数字
            if (Character.isDigit(aChar)){
                num = num * 10 +(aChar -'0');
            }
            //判断是否为空格
            if (aChar == ' '){
                continue;
            }
            //判断是否为符号
            else if (!Character.isDigit(aChar) || index == n){
                switch (pre){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case  '/':
                        stack.push(stack.pop()/num);
                        break;
                }
                pre = aChar;
                num = 0;
            }
        }
        while (!stack.isEmpty()){
            res += stack.pop();
        }

        return res;
    }
}
