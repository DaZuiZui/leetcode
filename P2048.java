import java.util.HashMap;
import java.util.Map;

public class P2048 {
    public static void main(String[] args) {
        System.out.println(new P2048().nextBeautifulNumber(1));
    }


    public int nextBeautifulNumber(int n) {

        for (int i = n+1; i < 1224445; i++) {
            if ( check(i+"")){
                return i;
            }
        }

        return -1;
    }

    public boolean check(String str){
        char[] chars = str.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
//        if (str.equals("1111")){
//            System.out.println("??");
//        }

        for (char aChar : chars) {
            map.put(aChar - '0',map.getOrDefault(aChar-'0',0)+1);
        }

        for (Map.Entry<Integer, Integer> characterIntegerEntry : map.entrySet()) {
            Integer key = characterIntegerEntry.getKey();
            Integer value = characterIntegerEntry.getValue();
            if (key != value){
                return false;
            }
        }

        return true;
    }
}
