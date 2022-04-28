package leccod;

import java.util.HashMap;

public class P383 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() == 0 && magazine.length() > 0){
            return true;
        }
        if (magazine.length() < ransomNote.length()){
            return false;
        }
        if (ransomNote.length() ==0 && magazine.length() == 0){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c) == false){
                return false;
            }else{
                int temp = map.put(c,map.get(c));
                if (--temp < 0){
                    return false;
                }else{
                    map.put(c,temp);
                }
            }
        }
        return true;
    }
}
