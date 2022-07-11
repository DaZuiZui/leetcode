import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class P6113 {
    public static void main(String[] args) {
        SmallestInfiniteSet s = new SmallestInfiniteSet();
        System.out.println(s.popSmallest());
        s.addBack(1);
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
        s.addBack(2);
        s.addBack(3);
        System.out.println(s.popSmallest());
        System.out.println(s.popSmallest());
    }
}

class SmallestInfiniteSet {
    //存放集合, 如果存在这个最小数 返回false， 不存在返回 true

    //存放添加的元素
     TreeSet addSet = new TreeSet<>();
    //存放移除的元素
    private TreeSet removeset = new TreeSet();

    public SmallestInfiniteSet() {

    }

    public int popSmallest() {
        //如果第一次使用的时候
        if (removeset.size() == 0){
            removeset.add(1);
            addSet.remove(1);
            return 1;
        }
        //第n次使用，
        //获取最小的删除元素
        int numberofremovemate = (int) removeset.first();
        while(removeset.contains(numberofremovemate)){
            numberofremovemate++;
        }
        //System.out.println("找到了"+numberofremovemate);
        //如果添加
        if (addSet.size() > 0){
            //获取添加最小元素

            int numberofaddmate = (int) addSet.first();
            //System.out.println("获取的"+numberofaddmate);
            //如果添加的元素小于最小删除最小的元素那么返回添加的元素，否则返回删除的最小元素
            if (numberofaddmate <= numberofremovemate){
                //System.out.println("添加"+numberofaddmate);
                addSet.remove(numberofaddmate);
                removeset.add(numberofaddmate);
                return numberofaddmate;
            }else{
                removeset.add(numberofremovemate);
                addSet.remove(numberofremovemate);
                return numberofremovemate;
            }
        }else{
            removeset.add(numberofremovemate);
            addSet.remove(numberofremovemate);
            return numberofremovemate;
        }
    }

    public void addBack(int num) {
        //查看removeset中是否存在，如果存在就删除
        if (removeset.contains(num)){
            removeset.remove(num);
            //添加到addset
            addSet.add(num);
        }
    }
}
