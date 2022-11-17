import java.util.*;

public class P229 {
    public static void main(String[] args) {
        System.out.println(new P229().majorityElement(new int[]{1,2}));
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> remove = new HashSet<>();
        int n =  nums.length;
        int tager = n /3;
        for (int num : nums) {
            if (remove.contains(num)){
                continue;
            }

            map.put(num,map.getOrDefault(num,0)+1);

            if (map.get(num) > tager) {
                list.add(num);
                map.remove(num);
                remove.add(num);
            }
        }


        return list;
    }
}
