package leccod;

import java.util.ArrayList;
import java.util.List;

public class P2194 {
    public static void main(String[] args) {
        new P2194().cellsInRange("AB12:B2");
    }

    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        for( char j = s.charAt(0) ;j <= s.charAt(3);j++){
            for(char i = s.charAt(1); i <= s.charAt(4);i++){
                list.add(j+""+i);
            }
        }
        return list;
    }
}
