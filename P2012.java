import java.util.PriorityQueue;
import java.util.TreeMap;

public class P2012 {
    public static void main(String[] args) {
        System.out.println(new P2012().sumOfBeauties(new int[]{2,4,6,4}));
    }

    int n = 0;
    TreeMap<Integer,Integer> left = new TreeMap<>();
    TreeMap<Integer,Integer> rigth = new TreeMap<>();
    public int sumOfBeauties(int[] nums) {
        this.n = nums.length;
        int res = 0;

        left.put(nums[0],1);

        for (int i = 1; i < n; i++) {
            rigth.put(nums[i],rigth.getOrDefault(nums[i],0)+1);
        }

        for (int i = 1; i <= n-2 ;i++) {
            Integer integer = rigth.get(nums[i]);
            if (integer == 1){
                rigth.remove(nums[i]);
            }else{
                rigth.put(nums[i],integer -1);
            }


            if (checkplantA(nums[i])){
                res +=2;
            }else if (checkPlantB(nums,i)){
                res++;
            }
            left.put(nums[i],left.getOrDefault(nums[i],0)+1);
        }

        return res;
    }

    public boolean checkplantA(int targer){
        Integer lmax = left.lastKey();
        Integer rmax = rigth.firstKey();
        if (lmax < targer && targer < rmax){
            return true;
        }
        return false;
    }

    public boolean checkPlantB(int[] arr ,int i){
        if (arr[i-1] < arr[i] && arr[i] < arr[i+1]){
            return true;
        }

        return false;
    }
}


