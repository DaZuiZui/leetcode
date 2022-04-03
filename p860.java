package leccod;

public class p860 {
    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten  = 0;
        for (int bill : bills) {
            //如果收到5元
            if (bill == 5){
                five++;
            }
            //如果收到10元
            else if (bill == 10){
                five--;
                ten++;


            }
            //如果收到20元
            else if(bill == 20){
                //查看能用十元不
                if (ten > 0){
                    ten--;
                    five--;
                }else{
                    five-=3;
                }


            }

            if(five < 0) return false;
        }
        return true;
    }
}
