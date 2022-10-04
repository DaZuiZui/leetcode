import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P811 {
    public static void main(String[] args) {
        System.out.println(new P811().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Long> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            //分割访问量和域名
            String[] s = cpdomains[i].split(" ");
            Integer number = Integer.valueOf(s[0]);
            while(true){
                int indexLast = s[1].indexOf('.');
                if (indexLast == -1){
                    break;
                }
                String key = s[1].substring(0,s[1].length());
                map.put(key,map.getOrDefault(key,Long.valueOf(0))+number);
                s[1] = s[1].substring(indexLast+1);
            }
            map.put(s[1],map.getOrDefault(s[1],Long.valueOf(0))+number);
        }

        for (Map.Entry<String, Long> tmp : map.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(tmp.getValue()+" ");
            stringBuilder.append(tmp.getKey());
            res.add(stringBuilder.toString());
        }
        return res;
    }
}
