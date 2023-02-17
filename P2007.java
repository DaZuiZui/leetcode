import java.util.*;

public class P2007 {
    public static void main(String[] args) {
        int[] originalArray = new P2007().findOriginalArray(new int[]{0,0,3});
        System.out.println(originalArray.length);
        for (int i : originalArray) {
            System.out.println(i);
        }
    }

    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int n = changed.length;
        int index =0;
        Map<Double,Integer> map = new HashMap<>();
        int[] res = new int[n/2];

        for (int i : changed) {
            double tmp = i *1.0 /2;
            if (!map.containsKey(tmp)){
                map.put(i*1.0, map.getOrDefault(i*1.0,0)+1);
                //res[index++] =  i;
            }else{
                if (index >= n/2){
                    return new int[]{};
                }
                if (map.containsKey(tmp)){
                    int vala = map.get(tmp);
                    if (vala == 1){
                        res[index++] = Integer.valueOf((int) tmp);
                        map.remove(tmp);
                    }else{
                        map.put(tmp*1.0,vala-1);
                        res[index++] = Integer.valueOf((int) tmp);
                    }
                    //map.put(i, map.getOrDefault(i,0)+1);
                }
            }
        }
        if (index *2 != n){
            return new int[]{};
        }
        return res;
    }
}
