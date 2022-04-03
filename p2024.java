package leccod;

public class p2024 {
    public static void main(String[] args) {

    }

    public int maxConsecutiveAnswers(String answerKey, int k) {

        return Math.max(maxlianxuchar(answerKey,k,'T'),maxlianxuchar(answerKey,k,'F'));
    }

    public int maxlianxuchar(String answerKey, int k,char c){
        int res = 0;
        int sum = 0;
        for(int l =0,r=0;r < answerKey.length() ;r++){
            sum += answerKey.charAt(r) == c ? 1 : 0;
            if (sum > k){
                sum -=  answerKey.charAt(l++) == c ? 1 : 0;
            }

            res = Math.max(res,r-l+1);
        }
        return res;
    }


}
