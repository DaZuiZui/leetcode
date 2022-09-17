import java.util.HashMap;
import java.util.Map;

public class P2404 {
    public static void main(String[] args) {
        System.out.println(new P2404().mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
    }

    public int mostFrequentEven(int[] nums) {
        int res = -1;
        int max = Integer.MIN_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            //判断是否为偶数
            if (num % 2 == 0){
                //记录他的存在次数
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }

        for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
            int k = tmp.getKey();
            int v = tmp.getValue();


            if (v > max){
                 max = v;
                 res = k;
            }else if (v == max){
                if (k < res){
                    res = k;
                }
            }
        }

        return res;
    }
}
