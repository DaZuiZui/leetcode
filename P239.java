import java.util.LinkedList;

public class P239 {
    public static void main(String[] args) {
        int[] ints = new P239().maxSlidingWindow(new int[]{9,10,9,-7,-4,-8,2,-6}, 5);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int index =0;
        LinkedList<Integer> list = new LinkedList<>();
        //初始化第一个滑动窗口
        for (int i = 0; i < k; i++) {
            while (!list.isEmpty() && list.peekLast() < nums[i]){
                list.removeLast();
            }
            list.addLast(nums[i]);
        }
        res[index++] = list.peekFirst();

        for (int i = k; i < n; i++) {
            //移除最左侧的元素
            if (nums[i - k] == list.peekFirst()){
                list.removeFirst();
            }
            //添加当前元素
            while (!list.isEmpty() && list.peekLast() < nums[i]){
                list.removeLast();
            }
            list.addLast(nums[i]);
            res[index++] = list.peekFirst();
        }

        return res;
    }
}
