package Sort;

/**
 * @author yujiahua
 */
public class Sort {
    /**
     * aux 是归并排序所需要的辅助数组
     */
    static int[] aux;
    public static void main(String[] args){
        int[] num = {9, 10, 7, 39, 83, 12, 75, 48, 75, 34};
        //selectionSort(num);
        //insertSort(num);
        //shellSort(num);
        //recursionSort(num);
        quickSort(num);
        show(num);
    }
    /**
     * 快速排序
     */
    private static void quickSort(int[] num){
        qusort(num, 0, num.length-1);
    }
    private static void qusort(int[] a, int lo, int hi){
        //注意这里一定是 <=
        if(hi <= lo){
            return;
        }
        int j = partition(a, lo, hi);
        qusort(a, lo, j-1);
        qusort(a, j+1, hi);
    }
    private static int partition(int[] a, int lo, int hi){
        int i = lo, j = hi+1;
        //切分元素
        int v = a[lo];
        while(true){
            while(less(a[++i], v)){
                if(i == hi){
                    break;
                }
            }
            while(less(v, a[--j])){
                if(j == lo){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    /**
     * 归并排序
     */
    private static void recursionSort(int[] num){
        aux = new int[num.length];
        resort(num, 0, num.length-1);

    }
    private static void resort(int[] a, int lo, int hi){
        if(hi <= lo) {
            return;
        }
        int mid = lo + (hi - lo)/2;
        resort(a, lo, mid);
        resort(a, mid+1, hi);
        merge(a, lo, mid, hi);

    }
    /**
     * 原地递归的抽象方法
     */
    private static void merge(int[] num, int lo, int mid, int hi){
        int i = lo, j = mid + 1;
        for(int k = lo; k <= hi; k++){
            aux[k] = num[k];
        }
        for(int k = lo; k <= hi; k++){
            if(i > mid){
                //左半边用尽
                num[k] = aux[j++];
            }
            else if(j > hi){
                //右半边用尽
                num[k] = aux[i++];
            }
            else if(less(aux[j], aux[i])){
                num[k] = aux[j++];
            }
            else{
                num[k] = aux[i++];
            }


        }
    }
    /**
     * 希尔排序
     */
    private static void shellSort(int[] num){
        int N = num.length;
        int h = 1;
        while(h < N/3){
            h = 3*h + 1;
        }
        while(h >= 1){
            for(int i = h; i < N; i++){
                //j-h > 0   so j > h
                for(int j = i; j >= h && less(num[j], num[j-h]); j -= h){
                    exch(num, j, j-h);
                }
            }
            h = h / 3;
        }
    }
    /**
     * 插入排序
     */
    private static void insertSort(int[] num){
        int N = num.length;
        for(int i = 1; i < N; i++){
            for(int j = i; j > 0 && less(num[j], num[j-1]); j--){
                exch(num, j, j-1);
            }
        }
    }
    /**
     * 选择排序,从小到大排序
     */
    private static void selectionSort(int[] num){
        for(int i = 0; i < num.length; i++){
            int min = i;
            for(int j = i+1; j < num.length; j++){
                if(less(num[j], num[min])) {
                    min = j;
                }
            }
            exch(num, i, min);
        }
    }

    /**
     * 判断a, b的大小
     */
    private static boolean less(int a, int b){
        return a < b;
    }

    /**
     * 交换a, b中的数据
     */
    private static void exch(int[] num, int a, int b){
        int temp = 0;
        temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    /**
     *  显示排序过后的数组
     */
    private static void show(int[] num){
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
