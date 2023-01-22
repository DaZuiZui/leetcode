package WeeklyContest329;

import java.util.Arrays;

public class P3 {
    public static void main(String[] args) {
        System.out.println(0^1);
        System.out.println(new P3().makeStringsEqual("101110100", "110011000"));
    }


    public boolean makeStringsEqual(String s, String target) {
        int zero=0,one=0;
        int target1=0,target2=0;

        for(char x : s.toCharArray()){
            if(x =='0'){
                ++zero;
            }else{
                ++one;
            }
        }
        for(char x:target.toCharArray()){
            if(x=='0'){
                ++target1;
            }else{
                ++target2;
            }
        }
        while(zero<target1){
            if(one>1){
                one-=1;
                zero+=1;
            }else{
                break;
            }
        }
        while(one<target2){
            if(one>0&&zero>0){
                one+=1;
                zero-=1;
            }else{
                break;
            }
        }
        return (zero==target1&&one==target2);
    }
}
