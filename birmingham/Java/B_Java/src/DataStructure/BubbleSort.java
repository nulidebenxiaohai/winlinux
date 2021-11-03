package DataStructure;
/*
冒泡排序：
定义一个布尔变量 hasChange，用来标记每轮是否进行了交换。在每轮遍历开始时，将 hasChange 设置为 false。

若当轮没有发生交换，说明此时数组已经按照升序排列，hashChange 依然是为 false。此时外层循环直接退出，排序结束。
 */
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 9, 5, 8};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void bubbleSort(int[] nums){
        boolean hasChange = true;
        for(int i = 0, n = nums.length; i < n-1 && hasChange; ++i){
            hasChange = false;
            for (int j = 0; j < n-i-1; ++j){//没i次循环就会得到i个排序后的末尾升序大值，每次内循环次数都会减少1
                if (nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    hasChange = true;//换序后将hasChange的值设置为true（另再次执行冒泡循环排序）
                }
                //如果nums[j] > nums[j+1]没有出现过，即已经完成了升序过程，则hasChange值为false（19行）
                //跳出循环
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
