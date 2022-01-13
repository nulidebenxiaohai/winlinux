# Leetcode 题解

## 双指针

1. 有序数组的Two Sum
2. 两数平方和
3. 反转字符串中的元音字符
4. 回文字符串
5. 归并两个有序数组
6. 判断链表是否存在环
7. 最长子序列

双指针主要用于遍历数组，两个指针指向不同的元素，从而协同完成任务

### 1. 有序数组的Two Sum

167. Two Sum || - Input array is sorted (Easy)

![image-20220113210725708](Leetcode.assets/image-20220113210725708.png)

```java
public int[] twoSum(int[] numbers, int target){
    if(numbers == null) return null;
    int i = 0;
    int j = numbers.length - 1;
    while(i < j){
        int sum = numbers[i] + numbers[j];
        if (sum == target){
            return new int[]{i+1,j+1};
        }
        else if(sum < target){
            i++;
        }
        else{
            j--;
        }
    }
    retrun null;
}
```







