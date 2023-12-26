import java.util.*;

/**
 * 圣诞活动预热开始啦，汉堡店推出了全新的汉堡套餐。为了避免浪费原料，请你帮他们制定合适的制作计划。
 *
 * 给你两个整数 tomatoSlices 和 cheeseSlices，分别表示番茄片和奶酪片的数目。不同汉堡的原料搭配如下：
 *
 * 巨无霸汉堡：4 片番茄和 1 片奶酪
 * 小皇堡：2 片番茄和 1 片奶酪
 * 请你以 [total_jumbo, total_small]（[巨无霸汉堡总数，小皇堡总数]）的格式返回恰当的制作方案，使得剩下的番茄片 tomatoSlices 和奶酪片 cheeseSlices 的数量都是 0。
 *
 * 如果无法使剩下的番茄片 tomatoSlices 和奶酪片 cheeseSlices 的数量为 0，就请返回 []。
 */
public class P1257 {
    public static void main(String[] args) {
        System.out.println(new P1257().numOfBurgers(17, 4));
    }

    int usperhambuger = -1;
    int minihambuger = -1;

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        dfs(tomatoSlices, cheeseSlices,0,0);
        if (usperhambuger != -1)
            list.add(usperhambuger);
        if (minihambuger != -1)
            list.add(minihambuger);
        return list;
    }

    public void dfs(int tomatoSlices, int cheeseSlices,int superh,int mini){
        if (usperhambuger != -1 || minihambuger != -1){
            return;
        }
        //查看是否用光
        if (tomatoSlices == 0 && cheeseSlices == 0){
            usperhambuger = superh;
            minihambuger = mini;
        }
        //如果可以做super
        if (tomatoSlices >= 4 && cheeseSlices >= 1){
            dfs(tomatoSlices - 4, cheeseSlices - 1 , superh+1, mini);
        }

        //如果可以做mini
        if (tomatoSlices >= 2 && cheeseSlices >= 1){
            dfs(tomatoSlices-2, cheeseSlices-1, superh, mini+1);
        }
    }
   
}
