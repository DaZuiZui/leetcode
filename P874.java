package leccod;

import java.util.HashSet;

public class P874 {
    public static void main(String[] args) {
        System.out.println(new P874().robotSim(new int[]{6,-1,-1,6}, new int[][]{}));
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        //记录障碍物
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++) {
            set.add(obstacles[i][0]+","+obstacles[i][1]);
        }


        /**
         * 0 代表北方向
         * 1 代表东
         * 2 代表南
         * 3 代表西
         */
        int  direction = 0;
        int x=0,y=0;
        int max =0;
        for (int i = 0; i < commands.length; i++) {
            //方向判断
            if (commands[i] < 0){
                //判断是否为向右转
                if (commands[i] == -1){
                    if (direction +1 > 3){
                        direction = 0;
                    }else{
                        direction++;
                    }
                }
                //判断是否为向右转
                else if (commands[i] == -2){
                    if (direction - 1 < 0){
                        direction = 3;
                    }else{
                        direction--;
                    }
                }
                System.err.println(direction);
                continue;
            }

            //确认移动方向
            switch (direction){
                case 0:
                    //判断是否拥有障碍物
                    for (int j = 0; j < commands[i]; j++) {
                        x++;
                        //判断是否拥有障碍物，如果拥有就停止
                        if (set.contains(y+","+x)){
                            x--;
                            break;
                        }

                    }
                    break;
                case 2:
                    //判断是否拥有障碍物
                    for (int j = 0; j < commands[i]; j++) {
                        x--;
                        //判断是否拥有障碍物，如果拥有就停止
                        if (set.contains(y+","+x)){
                            x++;
                            break;
                        }

                    }
                    break;
                case 1:
                    //判断是否拥有障碍物
                    for (int j = 0; j < commands[i]; j++) {
                        y++;
                        //判断是否拥有障碍物，如果拥有就停止
                        if (set.contains(y+","+x)){
                            y--;
                            break;
                        }
                    }
                    break;
                case 3:
                    //判断是否拥有障碍物
                    for (int j = 0; j < commands[i]; j++) {
                        y--;
                        //判断是否拥有障碍物，如果拥有就停止
                        if (set.contains(y+","+x)){
                            y++;
                            break;
                        }
                    }
                    break;
            }

            max = Math.max(x*x+y*y,max);
        }

        return max;
    }
}
