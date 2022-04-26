package leccod;

import java.util.HashSet;
import java.util.Set;

public class Offer48 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int res =0; //返回的最大长度
        //用来保存正在运算的字符，
        Set<Character> set = new HashSet<>();
        int inedx = -1; //指针 
        int stringLength = s.length();

        for(int i = 0 ; i < stringLength ; i++){
            if (i != 0){
                set.remove(s.charAt(i-1));
            }

            while (inedx + 1 <stringLength && !set.contains(s.charAt(inedx+1))){
                set.add(s.charAt(inedx+1));
                inedx++;
            }

            res = Math.max(res,inedx-i+1);
        }
        return res;
    }
}
