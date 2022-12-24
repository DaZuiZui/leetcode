import java.util.HashMap;
import java.util.Map;

public class P76 {
    public static void main(String[] args) {
        System.out.println(new P76().minWindow("a", "aa"));
    }

    private HashMap<Character, Integer> mapOfT = new HashMap<>();
    private HashMap<Character, Integer> mapOfS = new HashMap<>();

    public String minWindow(String s, String t) {
        int l = 0,r = 0;
        int resl = -1, resr = -1;
        int nOfT = t.length();
        int nOfS = s.length();
        int maxLength = Integer.MAX_VALUE;
        //t添加到背包中
        for (int i = 0; i < nOfT; i++) {
            mapOfT.put(t.charAt(i),mapOfT.getOrDefault(t.charAt(i),0)+1);
        }

        while (r < nOfS){
            //如果此字符是mapOfT的字符，那么就添加
            if (mapOfT.containsKey(s.charAt(r))){
                mapOfS.put(s.charAt(r),mapOfS.getOrDefault(s.charAt(r),0)+1);
            }

            //查看指定范围内是否合法 [l,r]
            while (l <= r && check()){
                //查看是否需要更新返回字符串
                if (r+1-l < maxLength){
                    maxLength = r +1-l;
                    resl = l;
                    resr = l+maxLength;
                }
                //清除l位置的字符串
                if (mapOfS.containsKey(s.charAt(l))){
                    mapOfS.put(s.charAt(l),mapOfS.get(s.charAt(l))-1);
                }
                l++;
            }
            r++;
        }

        return resl == -1 ? "": s.substring(resl,resr);
    }

    public boolean check(){
        for (Map.Entry<Character, Integer> map : mapOfT.entrySet()) {
            Character key = map.getKey();
            Integer   val = map.getValue();
            if (val > mapOfS.getOrDefault(key,0)){
                return false;
            }
        }
        return true;
    }
}
