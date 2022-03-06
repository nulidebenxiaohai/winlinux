package Sort;

public class heepSort {
    public static void main(String[] args){
        int[] num = {9, 10, 7, 39, 83, 12, 75, 48, 75, 34};

    }

}
class PQ{
    private int[] pq;
    /**存储pq[1...N]中，pq[0]没有使用**/
    private int N = 0;
    public PQ(int maxN){
        pq = new int[maxN+1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    /**
     * 将插入的值放在整一个数组的最后
     * 然后使用上浮函数将值上浮到该放的地方
     */
    public void insert(int v){
        pq[++N] = v;
        swim(N);
    }

    /**
     * 要得到最大的一个数，只要读取pq[1]就可以了
     * 然后将pq[1]和pq[N]交换
     * 然后使用下沉函数将pq[1]下沉下去
     */
    public int delMax(){
        int max = pq[1];
        exch(1, N--);
        pq[N+1] = 0;
        sink(1);
        return max;
    }
    /**
     * 由下至上的堆有序化（上浮）
     */
    private void swim(int k){
        while( k > 1 && less(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }

    /**
     * 由上至下的堆有序化（下沉）
     */
    private void sink(int k){
        while(2*k <= N){
            int j = 2*k;
            //这里j<N要注意⚠️
            //pq是顶点要比子节点都要大，所以要拿出子节点最大的那一个交换
            if(j < N && less(j, j+1)){
                j++;
            }
            if(!less(k, j)){
                break;
            }
            exch(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j){
        return pq[i] < pq[j];
    }

    private void exch(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}
