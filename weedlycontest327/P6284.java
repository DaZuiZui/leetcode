package weedlycontest327;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class P6284 {
    public static void main(String[] args) {
        System.out.println(new P6284().isItPossible("a", "bb"));
    }
    public boolean isItPossible(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (char c : word1.toCharArray()) {
            arr1[c-'a']++;
        }

        for (char c : word2.toCharArray()) {
            arr2[c-'a']++;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0){
                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] > 0){
                        //交换
                        arr1[i]--; arr2[i]++;
                        arr2[j]--; arr1[j]++;
                        
                        //查看是否一样
                        int x =0 ;

                        for (int k = 0; k < 26; k++) {
                            if (arr1[k] > 0){
                                x++;
                            }
                            if (arr2[k] > 0){
                                x--;
                            }
                        }

                        if (x == 0){
                            return true;
                        }
                        //撤回
                        arr1[i]++; arr2[i]--;
                        arr2[j]++; arr1[j]--;
                    }
                }
            }
        }
        return false;
    }
}
