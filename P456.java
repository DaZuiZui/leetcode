import java.util.LinkedList;
import java.util.Stack;

public class P456 {
    public static void main(String[] args) {
        System.out.println(new P456().find132pattern(new int[]{1,0,1,-4,-3}));
    }

    public boolean find132pattern(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        //用来维护第一个数字是最小的
        int[] minarr = new int[nums.length];
        minarr[0] = nums[0];

        //	创建一个数组用来记录i到num.length中最小的数，这么做的原因就是保证我们132中的其中1要保证是最小的值
        for (int i = 1; i < nums.length; i++) {
            minarr[i] = Math.min(minarr[i-1],nums[i]);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >= 0 ; i--) {
            //在循环期间一定要先筛选出num[i] > min[i]的元素，因为只有满足这个条件才能是我们想要的元素
            if (nums[i] > minarr[i]){
                //如果满足了这个条件，如果我们的栈不为NULL，但是我们栈中的元素小于等于minarr[i]的元素，
                //然后直接把把栈中的元素抛出，这么做就是为了保证找出**132** 其中的2
                while (!stack.isEmpty() && stack.peek() <= minarr[i]){
                    stack.pop();
                }
                //接下来判断我们栈中的peek()是否小于nums[i],如果小于那么我们就找到了大于min[i]且小于nums[i]的元素
                if (!stack.isEmpty() && stack.peek() <nums[i]){
                    return true;
                }
                //如果if不合法，那么就证明，当前这个元素可能是我们想要的132中的3，所以我们把当前这个元素添加到stack中，在后续的判断是否满足132.
                stack.push(nums[i]);
            }
        }
        return false;
    }
}
