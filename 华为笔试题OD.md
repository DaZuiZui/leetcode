# 华为笔试题OD

题目参考网站：http://101.43.147.120/p

## 1题 华为od-2022.11.5-k优雅阈值

### 题目内容

如果一个数组中出现次数最多的元素出现大于等于 �*k* 次， 被称为 �−优雅数组*k*−优雅数组 ， �*k* 也可以被称为优雅阈值。

例如，数组 [1,2,3,1,2,3,1][1,2,3,1,2,3,1] ，它是个 3−优雅数组3−优雅数组 ，因为元素 11 出现次数大于等于 33 次，数组 [1,2,3,1,2][1,2,3,1,2] 就不是一个 3−优雅数组3−优雅数组， 因为其中出现次数最多的元素是 11 和 22 ,只出现了 22 次。

给定一个数组 �*A* 和 �*k* ,请求出 �*A* 有多少子数组是 �−优雅子数组*k*−优雅子数组 。

子数组是数组中一个或多个连续元素组成的数组。

例如，数组 [1,2,3,4][1,2,3,4] 包含 1010 个子数组，分别是： [1][1] ， [1,2][1,2] ， [1,2,3][1,2,3] ， [1,2,3,4][1,2,3,4] ， [2][2] ， [2,3][2,3] ， [2,3,4][2,3,4] ， [3][3] ，[3,4][3,4] ， [4][4]

### 输入描述

第一行输入两个整数 �≤10000*n*≤10000 和 �≤�*k*≤*n* 。 1≤��≤�1≤*a**i*≤*n*

第二行输入 �*n* 个整数。

### 输出描述

输出给定的数组中有多少子数组是 �−优雅子数组*k*−优雅子数组

### 样例

**输入**

```none
7 3
1 2 3 1 2 3 1
```

[Copy](javascript:;)

**输出**

```none
1
```

## 思路

滑动窗口思想，首先我们定义2个指针，分别为左指针和右指针，我们右指针依次遍历元素，如果某一个元素出现的个数大于等于k了，那么就记录当前符合要求的是（数组长度 - 右指针下标），然后左指针自加1然后在判断右指针所在的元素出现的个数是否满足出现个数大于等于k，如果满足就在+1，一直重复此操作，直到不符合要求。

~~~java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int l = 0,r = 0 ; r < n; r++) {
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while (map.get(arr[r]) >= k){
                map.put(arr[l],map.get(arr[l])-1);
                l++;
                count+= n-r;
            }
        }

        System.out.println(count);
    }
}
~~~



## 第二题 华为od-2022.11.5-插队

# 插队

### 题目内容

某银行将客户分为了若干个优先级， 11 级最高， 55 级最低，当你需要在银行办理业务时，优先级高的人随时可以插队到优先级低的人的前面。

现在给出一个人员到来和银行办理业务的时间序列，请你在每次银行办理业务时输出客户的编号。

如果同时有多位优先级相同且最高的客户，则按照先来后到的顺序办理。

### 输入描述

输入第一行是一个正整数 *n* ,表示输入的序列中的事件数量。(1≤ n ≤500)

接下来有 *n* 行，每行第一个字符为 *a* 或 *p* 。

当字符为 �*a* 时，后面会有两个的正整数 ���*n**u**m* 和 �*x* ,表示到来的客户编号为 ���*n**u**m* ,优先级为 �*x* ;

当字符为 �*p* 时，表示当前优先级最高的客户去办理业务。

### 输出描述

输出包含若干行，对于每个 �*p* ， 输出一行，仅包含一个正整数 ���*n**u**m* , 表示办理业务的客户编号。

### 样例

**输入**

```none
4
a 1 3
a 2 2
a 3 2
p
```

[Copy](javascript:;)

**输出**

```none
2
```



### 思路：

他说有5个等级，那我们只需要维护5个队列集合，遇见插队的就从第一个队列遍历到第五个，如果队列有元素，那么直接弹出打印就行了

~~~java
import java.util.*;

public class P1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue[] queues = new LinkedList[6];
        for (int i = 0; i < 6; i++) {
            queues[i] = new LinkedList();
        }

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            if (str.equals("a")) {
                int num = scanner.nextInt();
                int a = scanner.nextInt();
                queues[a].offer(num);
            }else{
                for (int j = 1; j < 6; j++) {
                    if (!queues[j].isEmpty()){
                        System.out.println(queues[j].poll());
                        break;
                    }
                }
            }
        }
    }
}
~~~

