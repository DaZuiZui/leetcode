import java.util.TreeMap;

public class P2044 {
    public static void main(String[] args) {
        System.out.println(new P2044().countMaxOrSubsets(new int[]{3,2,1,5}));
    }

    TreeMap<Integer,Integer> map = new TreeMap<>();

    public int countMaxOrSubsets(int[] nums) {
        int res =0;
        dfS(nums,0,0);
        return map.lastEntry().getValue();
    }

    public void dfS(int[] num,int index,int sum){
        if (num.length == index){
            map.put(sum,map.getOrDefault(sum,0)+1);
            return;
        }

        map.put(sum,map.getOrDefault(sum,0)+1);

        for (int i = index; i < num.length; i++) {
            dfS(num,i+1,sum | num[i]);
        }

    }
}
