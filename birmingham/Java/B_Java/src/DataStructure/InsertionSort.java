package DataStructure;

import java.util.Arrays;

/*
插入排序：
先来看一个问题。一个有序的数组，我们往里面添加一个新的数据后，如何继续保持数据有序呢？
很简单，我们只要遍历数组，找到数据应该插入的位置将其插入即可。

这是一个动态排序的过程，即动态地往有序集合中添加数据，我们可以通过这种方法保持集合中的
数据一直有序。而对于一组静态数据，我们也可以借鉴上面讲的插入方法，来进行排序，于是就有
了插入排序算法。

那么插入排序具体是如何借助上面的思想来实现排序的呢？

首先，我们将数组中的数据分为两个区间，已排序区间和未排序区间。初始已排序区间只有一个元素，
就是数组的第一个元素。插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的
插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，
算法结束。

与冒泡排序对比：

在冒泡排序中，经过每一轮的排序处理后，数组后端的数是排好序的。
在插入排序中，经过每一轮的排序处理后，数组前端的数是排好序的。
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void insertionSort(int[] nums){
        for(int i = 1, j, n = nums.length; i < n; i++){//注意这里j要定义在这里，因为后面有nums[j+1] = num;
            int num = nums[i];
            for (j = i - 1; j >=0 && nums[j] > num; --j) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = num;
        }
    }
}
