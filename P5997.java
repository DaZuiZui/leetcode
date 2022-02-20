package leccod;

public class P5997 {
    public static void main(String[] args) {

    }

    public long[] sumOfThree(long num) {
        return num % 3 == 0 ? new long[]{num%3-1,num%3,num%3+1} : new long[0];
    }
}
