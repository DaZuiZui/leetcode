package leccod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P2225 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list =new ArrayList<>();
        HashMap<Integer,Integer> wincount = new HashMap<>();     //记录每个玩家胜利的场次
        HashMap<Integer,Integer> loscount = new HashMap<>();     //记录每个玩家失败的场次
        List<Integer> winlist = new ArrayList<>();

        //更新比赛场数
        for (int i = 0; i < matches.length; i++) {
            //更新胜利者胜利次数
            wincount.put(matches[i][0],wincount.getOrDefault(matches[i][0],0)+1);
            //更新失败者失败次数
            loscount.put(matches[i][1],loscount.getOrDefault(matches[i][1],0)+1);
        }

        //没有 输掉任何比赛的玩家列表
        for (Integer integer : wincount.keySet()) {
            //查看该选手是否有失败经历
            if (!loscount.containsKey(integer)) {
                winlist.add(integer);
            }
        }
        winlist.sort(null);
        list.add(new ArrayList<Integer>(winlist));
        winlist.clear();

        //查看输掉一场比赛的玩家
        for (Integer integer : loscount.keySet()) {
            if (loscount.get(integer) == 1){
                winlist.add(integer);
            }
        }
        winlist.sort(null);
        list.add(new ArrayList<Integer>(winlist));

        return list;
    }
}
