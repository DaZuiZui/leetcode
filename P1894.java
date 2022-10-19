public class P1894 {
    public static void main(String[] args) {

    }
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk[0] > k){
            return 0;
        }
        for (int i = 1; i < chalk.length; i++) {
            chalk[i] += chalk[i-1];
            if (chalk[i] > k){
                return i;
            }
        }

        k %= chalk[chalk.length-1];

        return binarySearch(chalk,k);
    }


    public int binarySearch(int[] arr,int targer){
        int low = 0,heigh = arr.length-1;
        while (low < heigh){
            int mid = (heigh - low)/2 + low;
            if (arr[mid] <= targer){
                low =  mid+1;
            }else{
                heigh = mid;
            }
        }

        return low;
    }
}
