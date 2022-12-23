import java.util.HashMap;

public class P904 {
    public static void main(String[] args) {
        System.out.println(new P904().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public int totalFruit(int[] fruits) {
        //背包
        HashMap<Integer,Integer> map = new HashMap<>();

        int res = 0;
        int n = fruits.length;
        for (int r = 0,l=0; r < n; r++) {
            //查看是否可以直接放
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            //超出背包范围
            if (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;
            }
            //System.out.println(r+"and"+l);
            res = Math.max(res,r-l+1);
        }

        return res;
    }
}
