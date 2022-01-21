# 基础数据结构

## 1.1 数组/链表

### 前缀和数组

前缀和 主要适用的场景是原始数组不会被修改的情况下，频繁查询某个区间的累加和。其核心代码为：

```java
class PrefixSum{
    //前缀和数组
    private int[] prefix;
    
    /*输入一个数组，构造前缀和*/
    public PrefixSum(int[] nums){
        prefix = new int[nums.length + 1];
        //计算nums的累加和
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }
    }
    
    /*查询闭区间[i, j]的累加和*/
    public int query(int i, int j){
        return prefix[j + 1] - prefix[i];
    }
}
```



#### 303. 区域和检索-数组不可变

![image-20220118192910235](labuladong.assets/image-20220118192910235.png)

```java
class NumArray {
    private int[] prenums;
    public NumArray(int[] nums) {
        int n = nums.length;
        prenums = new int[n + 1];
        for(int i = 0; i < n; i++){
            prenums[i+1] = prenums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prenums[right + 1] - prenums[left];
    }
}
```

#### 304. 二维区域和检索 - 矩阵不可变

![image-20220118193131331](labuladong.assets/image-20220118193131331.png)

<img src="labuladong.assets/image-20220118193147205.png" alt="image-20220118193147205" style="zoom:67%;" />

```java
class NumMatrix {
    private int[][] presum;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if(m == 0 || n == 0) return;
        
        presum = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                presum[i][j] = presum[i-1][j] + presum[i][j-1] + matrix[i-1][j-1] - presum[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return presum[row2+1][col2+1] - presum[row1][col2+1] - presum[row2+1][col1] + presum[row1][col1];
    }
}
```

#### 560. 和为K的子数组

![image-20220118193431352](labuladong.assets/image-20220118193431352.png)

![image-20220118201020099](labuladong.assets/image-20220118201020099.png)

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0, sum_i = 0;
        for(int i = 0; i < n; i++){
            sum_i += nums[i];
            int sum_j = sum_i - k;
            if(map.containsKey(sum_j)){
                res += map.get(sum_j);
            }
            map.put(sum_i, map.getOrDefault(sum_i,0) + 1);
        }
        return res;
    }
}
```

### 差分数组技巧

差分数组的主要使用场景是频繁对原始数组的某个区间的元素进行增减。通过这个diff差分数组是可以反推出原始数组nums的。

```java
int[] diff = new int[nums.length];
//构造差分数组
diff[0] = nums[0];
for (int i = 1; i < nums.length; i++){
    diff[i] = nums[i] - nums[i - 1];
}
```

#### 370. 区间加法

![image-20220118221621141](labuladong.assets/image-20220118221621141.png)

```java
????这道题需要会员
```

#### 1109. 航班预定统计

![image-20220118222528470](labuladong.assets/image-20220118222528470.png)

```java
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        for(int[] booking : bookings){
            int i = booking[0];
            int j = booking[1];
            int val = booking[2];
            nums[i-1] += val;
            if(j < nums.length){
                nums[j] -=val;
            }
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i - 1] + nums[i];
        }
        return res;
    }
}
```

### 滑动窗口算法

### 二分搜索

零，二分查找框架

```java
int binarySerach(int[] nums, int target){
    int left = 0, right = ...;
    while(...) {
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            ...
        }else if(nums[mid] < target){
            left = ...
        }else if(nums[mid] > target){
            right = ...
        }
    }
    return ...;
}
```

**分析二分查找的一个技巧是： 不要出现else，而是把所有情况都用else if写清楚，这样可以清楚地展现所有细节。**

*PS： 计算mid时要防止溢出，代码中 left + (right - left) / 2 就和（left + right）/ 2的计算结果相同，但是有效防止了 left 和 right 太大直接相加导致溢出。*

一、寻找一个数（基本的二分搜索）

最简单的场景，搜索一个数，如果存在，返回其索引，否则返回-1.

```java
int binarySeearch(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;
    
    while(left <= right){ //终止条件是 left = right + 1 例如[3,2)
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            left = mid + 1;
        }
        else if(nums[mid] > target)
            right = mid - 1;
    }
    return -1;
}
```

1. 如果使用while(left < right)，其终止条件是 left == right，写成区间的形式为[right，right]，或者是[2,2]，这个时候区间非空还有一个2，但是这个时候while循环终止了，缺少了索引2。

2. **为什么使用left = mid + 1, right = mid - 1?**

   要明确什么是搜索区间，一开始的搜索区间是[left, right]。当索引mid不是要找的target时，接下来应该去搜索[left, mid-1]或者[mid+1,right]。因为mid已经搜索过，应该从搜索区间中去除

3. 这个算法难以找到索引的左右边界，例如数组[1,2,2,2,3],target为2，返回的索引为2，但是若要得到左右边界，此算法就无法处理。

二、寻找左侧边界的二分搜索

```java
int left_bound(int[] nums, int target){
    if(nums.length == 0) return -1;
    int left = 0;
    int right = nums.length;
    
    while(left < right){ //终止条件是 left = right
        int mid = left + (right - left)/2;
        if(nums[int] == target){
            right = mid;
        }
        else if(nums[mid] < target){
            left = mid + 1;
        }
        else if(nums[mid] > target){
            right = mid;
        }
    }
    return left;
    //还要检查出界情况
}
```

或者使用这个形式：

```java
int left_bound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
     // 搜索区间为 [left, right]
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            // 搜索区间变为 [mid+1, right]
            left = mid + 1;
        } else if (nums[mid] > target) {
            // 搜索区间变为 [left, mid-1]
            right = mid - 1;
        } else if (nums[mid] == target) {
            // 收缩右侧边界
            right = mid - 1;
        }
     }
     // 检查出界情况
     if (left >= nums.length || nums[left] != target)
         return -1;
     return left;
}
```

三、寻找右侧边界的二分查找

```java
int right_bound(int[] nums, int target){
    if(nums.length == 0) return -1;
    int left = 0, right = nums.length;
    
    while(left < right){
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            left = mid + 1;
        }
        else if(nums[mid] < target){
            left = mid + 1;
        }
        else if(nums[mid] > target){
            right = mid;
        }
    }
    return left - 1;//!!!!注意！！！
}
```



#### 704. 二分查找

#### 34. 在排序数组中查找元素的第一个和最后一个位置

### 二分搜索题型套路分析

二分搜索的套路框架

```java
//函数f是关于自变量的x的单调函数
int f(int x){
    //...
}

//主函数，在f(x) == target的约束下求x的值
int soluation(int[] nums, int target){
    if(nums.length == 0) return -1;
    //问自己：自变量的x的最小值是多少？
    int left = ...;
    //问自己：自变量x的最大是多少？
    int right = ... + 1;
    
    while(left < right){
        int mid = left + (right - left) / 2;
        if(f(mid) == target){ //mid 相当于是被除去的！！！！！！！！！！！！！
            //问自己：题目是求左边界还是右边界
            //...
        }
        else if(f(mid) < target){
            //问自己：怎么让f(x)大一点？
            ///...
        }
        else if(f(mid) > target){
            //问自己：怎么让f(x)小一点？
            //...
        }
    }
    return left;
}
```

具体来说，想要用二分搜索算法解决问题，分为以下几步：

1. 确定x, f(x), target分别是什么，并且写出函数f的代码
2. 找到x的取值范围作为二分搜索的搜索区间，初始化left和right变量
3. 根据题目的要求，确定应该使用左侧还是右侧的二分搜索算法，写出解法代码

#### 875. 爱吃香蕉的珂珂

![image-20220120235132728](labuladong.assets/image-20220120235132728.png)

```java
class Solution {
    public int minEatingSpeed(int[] piles, int H){
        int left = 1;
    }
}
```



#### 1011. 在D天内送达包裹的能力

### 田忌赛马背后的算法决策

```java
int[] advantageCount(int[] sums1, int[] nums2){
    int n = nums1.length;
    //给nums2降序排序
    PriorityQueue<int[]> maxpq = new PriorityQueue<>(
        (int[] pair1, int[] pair2)->{
            return pair2[1] - pair1[2];
        }
    );
    for(int i = 0; i < n; i++){
        maxpq.offer()
    }
}
```

#### 870.优势洗牌



### 一文秒杀四道原地修改数组的算法题

#### 26. 删除有序数组中的重复项

![image-20220121153449948](labuladong.assets/image-20220121153449948.png)

```java
//使用快慢指针
int removeDuplicates(int[] nums){
    if(nums.length == 0){
        return 0;
    }
    int slow = 0, fast = 0;
    while(fast < nums.length){
        if(nums[fast] != nums[slow]){
            slow++;
            nums[slow] = nums[fast];
        }
        fast++;
    }
    return slow+1;
}
```



#### 83. 删除排序链表中的重复元素

#### 27. 移除元素

#### 283. 移动零





