package leccod;

public class P2211 {
    public static void main(String[] args) {

    }

    public int countCollisions(String directions) {
        int l =0 ,r =directions.length()-1,res =0;
        //让合法的左侧拐弯的车通过
        while(l < directions.length() && directions.charAt(l) == 'L'){
            l++;
        }
        //让合法的右侧拐弯的车通过
        while(r >= 0 && directions.charAt(r) == 'R'){
            r--;
        }

        //保留在中间的车如果不停车 那么就会被撞
        while (l <= r){
            if (directions.charAt(l) != 'S'){
                res++;
            }
            l++;
        }
        return res;
    }
}
