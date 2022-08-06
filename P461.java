public class P461 {
    public static void main(String[] args) {
        System.out.println(new P461().hammingDistance(3, 1));
    }

    public int hammingDistance(int x, int y) {
        int count =0;
        if (x==y){
            return 0;
        }
        while (x!=0 || y!= 0){
            if (x%2!= y%2){
                count++;
            }

            x=x/2;
            y=y/2;
        }

        return count;
    }
}
