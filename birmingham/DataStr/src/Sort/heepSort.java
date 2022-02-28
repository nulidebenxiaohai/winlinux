package Sort;

public class heepSort {
    public static void main(String[] args){
        int[] num = {9, 10, 7, 39, 83, 12, 75, 48, 75, 34};

    }

}
class PQ{
    private int[] pq;
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

    public void insert(int v){
        pq[++N] = v;
        swim(N);
    }

    public int delMax(){
        int max = pq[1];
        exch(1, N--);
        pq[N+1] = 0;
        sink(1);
        return max;
    }

    private void swim(int k){
        while( k > 1 && less(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k){
        while(2*k <= N){
            int j = 2*k;
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
        return i < j;
    }

    private void exch(int i, int j) {
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }
}
