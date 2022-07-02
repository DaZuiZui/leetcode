import java.util.Stack;

public class P682 {
    public static void main(String[] args) {
        System.out.println(new P682().calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    public int calPoints(String[] ops) {
        int res =0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")){
                //如果zhan中为null 那么就跳出进入下一次循环
                if (stack.isEmpty()){
                    break;
                }
                //弹出
                stack.pop();
            }else if (ops[i].equals("D")){
                //如果zhan中为null 那么就跳出进入下一次循环
                if (stack.isEmpty()){
                    break;
                }

                //前一次的得分*2
                int tmp = stack.peek();
                stack.push(tmp*2);
            }else if (ops[i].equals("+")){
                //查看栈中元素是否大雨等于2
                if (stack.size() < 2){
                    break;
                }

                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num1 + num2;
                stack.push(num1);
                stack.push(num2);
                stack.push(sum);
            }else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }


        for (Integer integer : stack) {
            res += integer;
        }
        return res;
    }
}
