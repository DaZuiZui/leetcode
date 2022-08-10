public class P640 {
    public static void main(String[] args) {
        System.out.println(new P640().solveEquation("-x=-1"));
    }

    public String solveEquation(String equation) {
        int corr = 0,sum =0 ,sige = 1,index =0;

        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == '='){
                //出现了x+5=... 的情况
                if (index < i){
                    sum += Integer.valueOf(equation.substring(index,i));
                }
                sige = -1;
                index = i + 1;

            } else if (c == 'x') {
                //如果遇见的只是一个单独的X 但是x可能是正的也可以能是负的
                if (index == i || equation.charAt(i-1) == '-'){
                    corr += sige;
                } else if (equation.charAt(i-1) == '+') {
                    corr -= sige;
                }
                //出现3x 4x情况
                else{
                    corr += Integer.valueOf(equation.substring(index,i)) * sige;
                }
                index = i + 1;
            } else if (c == '+' || c == '-') {
                if (index < i){
                    sum += Integer.valueOf(equation.substring(index,i)) * sige;

                }
                //关于为什么index ==i 是放逐出现 +5-3这种情况 要读取的是-3而不是3
                index = i;
            }
        }

        /**
         * 会出现一种特殊情况比如6+x-2"
         * 当index到倒数第2个的时候 但是i会一直往后走 会结束for循环 所以要把最后一个数字耶计算进入
         */
        if (index < equation.length()){
            sum += Integer.valueOf(equation.substring(index,equation.length())) * sige;
        }

        System.out.println(corr);
        System.out.println(sum);

        if (corr == 0 && sum == 0){
            return "Infinite solutions";
        }

        if (corr == 0){
            return "No solution";
        }

        return  "x="+String.valueOf(-sum/corr);
    }
}
