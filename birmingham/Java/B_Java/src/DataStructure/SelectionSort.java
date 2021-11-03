package DataStructure;

import java.util.Arrays;

/*
选择排序：
选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。但是选择排序每次会
从未排序区间中找到最小的元素，将其放到已排序区间的末尾。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void selectionSort(int[] nums) {
        for (int i = 0, n = nums.length; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i; j < n; ++j) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;//minIndex指的是最小的那个数
                }
            }
            swap(nums, minIndex, i);
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
