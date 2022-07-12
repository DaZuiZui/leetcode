import java.util.*;

public class P1296 {
    public static void main(String[] args) {
        System.out.println(new P1296().isPossibleDivide(new int[]{1, 1,2,2,3,3}, 2));
    }

    public boolean isPossibleDivide(int[] nums, int k) {
        //查看数组是否为n的k倍，如果不是就返回false；
        if (nums.length % k != 0){
            return false;
        }

        //使用TreeMap记录所有的字符的出现个数
        TreeMap<Integer, Integer> map = new TreeMap<>();
        //将nums的内容put to the list
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        while (!map.isEmpty()){
            if (map.size() < k) return  false;
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
            Map.Entry<Integer, Integer> tmp = map.pollFirstEntry();
            list.add(tmp);
            int lastkey = tmp.getKey();
            //查看是否满足连续
            for (int i = 1; i < k; i++) {
                //System.out.println(i);
                Map.Entry<Integer, Integer> tmp1 = map.pollFirstEntry();
                //System.out.println(tmp1);
                int currentKey = tmp1.getKey();
                if (lastkey+1 != currentKey){

                    return false;
                }
                //更新当前状态
                lastkey = currentKey;
                list.add(tmp1);
            }

            //将list中的entry中的value全部-1
            //如果value -1 == 0 那么就不把这个元素添加到map中
            for (Map.Entry<Integer, Integer> m : list) {
                Integer key = m.getKey();
                Integer value = m.getValue() - 1;
                if (value > 0){
                    map.put(key,value);
                }
            }
        }

        return true;
    }
}
