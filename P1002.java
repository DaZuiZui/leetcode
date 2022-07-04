import java.util.ArrayList;
import java.util.List;

public class P1002 {
    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        //初始化
        char[] chars = words[0].toCharArray();
        int[] hash = new int[26];
        for (char aChar : chars) {
            hash[aChar - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] otherhash = new int[26];
            char[] otherArray = words[i].toCharArray();
            //查看其他的字符串每个出现的次数
            for (char c : otherArray) {
                otherhash[c - 'a']++;
            }

            //查看他们的共同之处
            for (int j = 0; j < otherhash.length; j++) {
                hash[i] = Math.max(hash[i],otherhash[i]);
            }
        }

        for (int i = 0; i < hash.length; i++) {
            while(hash[i] > 0){
                char c = (char) (i +'a');
                String tmp = String.valueOf(c);
                res.add(tmp);
                hash[i]--;
            }
        }

        return res;
    }
}
