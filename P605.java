public class P605 {
    public static void main(String[] args) {
        System.err.println(new P605().canPlaceFlowers(
                new int[]{1,0}
                , 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0){
            return true;
        }
        for (int i = 0; n > 0 && i < flowerbed.length; i++) {
            //判断当前下标是否可以种花
            if (flowerbed[i] == 0){
                //左右两边的情况
                if (i == 0){
                    if (flowerbed[i+1] == 0) {
                        flowerbed[i] = 1;
                        n--;
                    }
                }else if (flowerbed.length > 1 && i == flowerbed.length -1){
                    if (flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        n--;
                    }
                }else{
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] ==0 ){
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }


        return n == 0;
    }
}
