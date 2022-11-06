# Leecode 周赛318场

## 第一题

直接遍历

### code

~~~java
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1]){
                nums[i] = nums[i+1]*2;
                nums[i+1]=0;
                i++;
            }else{
                continue;
            }
        }

        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                res[index++] = nums[i];
            }
        }

        return res;
    }
~~~



## 第二题 长度为 K 子数组中的最大和

​	思路使用滑动窗口，首先创建一些基础变量，使用set来保证子数组没有重复

~~~java
        long res = 0;       //最终返回值
        int l= 0;           //左指针
        int r=0;            //右指针
        long sum =0;        //总和
        int n = nums.length;; //长度
        Set<Integer> set = new HashSet<>(); //set用来保用子数组无重复
~~~

如果我们的元素在set中不存在，那么我们把当前元素放入set集合中，放入成功查看子数组的长度是否大于k，如果大于k那么就移除子数组最左侧的元素，之后判断我们的子数组长度是否等于k，如果满足就判断当前的sum是否为最大值

~~~java
            if (!set.contains(nums[r])){
                set.add(nums[r]);
                sum += nums[r];

                if (r-l+1 > k){
                    sum-=nums[l];
                    set.remove(nums[l++]);
                }

                if (r-l+1 == k){
                    res = Math.max(res,sum);
                }
                r++;
            }
~~~

如果在set集合中已经存在此元素，如果l在r左侧，我们要保证l必须小于r，并且当前这个元素nums[r]依然存在集合中，那么就移除数组最左侧的元素。

```java
else{
    while (l < r && set.contains(nums[r])){
        sum -= nums[l];
        set.remove(nums[l++]);
    }
}
```

### code

```java
public long maximumSubarraySum(int[] nums, int k) {
    long res = 0;       //最终返回值
    int l= 0;           //左指针
    int r=0;            //右指针
    long sum =0;        //总和
    int n = nums.length;; //长度
    Set<Integer> set = new HashSet<>(); //set用来保用子数组无重复

    while (r < n){
        //查看是否已经添加
        if (!set.contains(nums[r])){
            set.add(nums[r]);
            sum += nums[r];

            if (r-l+1 > k){
                sum-=nums[l];
                set.remove(nums[l++]);
            }

            if (r-l+1 == k){
                res = Math.max(res,sum);
            }
            r++;
        }else{
            while (l < r && set.contains(nums[r])){
                sum -= nums[l];
                set.remove(nums[l++]);
            }
        }
    }

    return res;
}
```

## 第三题 [雇佣 K 位工人的总代价](https://leetcode.cn/problems/total-cost-to-hire-k-workers/)

​	使用两个优先队列分别维护前candidates个，和后candidates个。

~~~java
        int l = 0; //数组左侧的指针
		int r= costs.length -1; //数组右侧的指针
        long res = 0;	//res
        int n = costs.length;	
        PriorityQueue<Integer> leftQue = new PriorityQueue<>();
        PriorityQueue<Integer> rigthQue = new PriorityQueue<>();
~~~

接下来我们对我们的优先队列进行从初始化，把前candidates个和后candidates个都放入优先队列中

~~~java
        for (int i = 0; i < candidates; i++) {
             if (l<=r){
                 leftQue.offer(costs[l++]);
             }
             if (l <= r){
                 rigthQue.offer(costs[r--]);
             }
        }
~~~

接下来判断下leftQue和rigthQue最小的元素谁是最小的，如果谁的优先队列的元素是最小的谁poll一个，poll完事以后查看是否可以装入新元素，如果l<r就可以装入新的元素，最后记录下总和即可

~~~java
        for (int i = 0; i < k; i++) {
            int lmin = leftQue.isEmpty() ? Integer.MAX_VALUE: leftQue.peek();
            int rmin = rigthQue.isEmpty() ? Integer.MAX_VALUE : rigthQue.peek();
            if (lmin <= rmin){
                res +=leftQue.poll();
                if (l <= r){
                    leftQue.offer(costs[l++]);
                }

            }else{
                res += rigthQue.poll();
                if (l <= r){
                    rigthQue.offer(costs[r--]);
                }
            }
        }
~~~

### code

~~~java
    public long totalCost(int[] costs, int k, int candidates) {
        int l = 0 , r= costs.length -1;
        long res = 0;
        int n = costs.length;
        PriorityQueue<Integer> leftQue = new PriorityQueue<>();
        PriorityQueue<Integer> rigthQue = new PriorityQueue<>();

        for (int i = 0; i < candidates; i++) {
             if (l<=r){
                 leftQue.offer(costs[l++]);
             }
             if (l <= r){
                 rigthQue.offer(costs[r--]);
             }
        }

        for (int i = 0; i < k; i++) {
            int lmin = leftQue.isEmpty() ? Integer.MAX_VALUE: leftQue.peek();
            int rmin = rigthQue.isEmpty() ? Integer.MAX_VALUE : rigthQue.peek();
            if (lmin <= rmin){
                res +=leftQue.poll();
                if (l <= r){
                    leftQue.offer(costs[l++]);
                }

            }else{
                res += rigthQue.poll();
                if (l <= r){
                    rigthQue.offer(costs[r--]);
                }
            }
        }


        return res;
    }
~~~

