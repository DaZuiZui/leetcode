import java.util.PriorityQueue;

public class P4 {
    public static void main(String[] args) {

    }

    /**
     * 保证放的都是小值并且拿出来的值是最小值中的最大的
     */
    private PriorityQueue<Integer> minQue = new PriorityQueue<>((a,b)->{
        return b-a;
    });
    /**
     * 放进去都是最大的值，保证每次取出来的都是最小的
     */
    private PriorityQueue<Integer> maxQue = new PriorityQueue<>((a,b)->{
        return a-b;
    });

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        for (int i : nums1) {
            add(i);
        }
        for (int i : nums2) {
            add(i);
        }
        return maxQue.size() == minQue.size() ? (maxQue.poll() + minQue.poll()) * 0.5 : minQue.peek() * 1.0;
    }

    public void add(int num){
        if (minQue.isEmpty() || num <= minQue.peek()){
            minQue.offer(num);
            /**
             * 保证minQue的元素比max多一个或者相同
             */
            if (maxQue.size() + 1 < minQue.size()){
                maxQue.offer(minQue.poll());
            }
        }else{
            maxQue.offer(num);
            /**
             * 保证minQue的元素比max多一个或者相同
             */
            if (maxQue.size() > minQue.size()){
                minQue.offer(maxQue.poll());
            }
        }
    }
}
