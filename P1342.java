package leccod;

public class P1342 {
    public static void main(String[] args) {
        System.out.println(new P1342().numberOfSteps(14));
    }

    public int numberOfSteps(int num) {
        int count = 0;

        while (num != 0){
            //判断为奇数还是偶数
            if (num % 2 == 0){
                num = num /2;
                count++;
            }else{
                num = num -1;
                count++;
            }
        }
        return count;
    }
}
