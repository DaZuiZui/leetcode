package daimasuixianglu;

public class P706 {
    public static void main(String[] args) {
        System.err.println(new P706().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0 , r = n-1;
        while (l <= r){
            int mid = l+ (r -l)/2;
            if (nums[mid] < target){
                l = mid+1;
            }else if (nums[mid] > target){
                r = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
