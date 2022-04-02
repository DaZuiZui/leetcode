package leccod;

public class Offer64 {
    public static void main(String[] args) {
        System.out.println(new Offer64().sumNums(9));
    }

    int sum = 0;
    public int sumNums(int n) {
        if (n ==0){
            return 0;
        }
        sum+=n;
        sumNums(n-1);
        return sum;
    }
}
