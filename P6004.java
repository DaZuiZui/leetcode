package leccod;

public class P6004 {
    public static void main(String[] args) {
        System.out.println(new P6004().countOperations(0, 0));
    }

    public int countOperations(int num1, int num2) {
        if (num1 == 0 || num2 ==0){
            return 0;
        }

        int count =0;
        while (true){
            if (num1 <= num2){
                num2 = num2 - num1;
                count++;
            }else if(num2 <= num1){
                num1 = num1 - num2;
                count++;
            }

            if (num1 == 0 || num2 ==0){
                break;
            }
        }
        return count;
    }
}
