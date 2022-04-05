package leccod;

import java.util.HashMap;

public class P567 {
    public static void main(String[] args) {
        new P567().checkInclusion("ab","eidbaooo");
    }

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int index = 0;

        for(int i = 0 ; i < len1 ; i++ , index++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }

        while(index < len2){
            if(map1.equals(map2)){
                return true;
            }

            char before = s2.charAt(index - len1);
            char after  = s2.charAt(index);

            //remove
            map2.put(before,map2.get(before)-1);

            if(map2.get(before) <= 0){
                map2.remove(before);
            }

            map2.put(after,map2.getOrDefault(after,0)+1);
            index++;
        }


        return map1.equals(map2);
    }
}
