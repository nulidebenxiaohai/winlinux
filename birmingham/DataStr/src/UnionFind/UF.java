package UnionFind;

/**
 * @author yujiahua
 */
public class UF {
    /***
     * 连通分量个数
     */
    private int count;
    /***
     * 存储一棵树
     */
    private int[] parent;
    /***
     * 记录数的[重量]
     */
    private int[] size;
    /***
     * n为图中节点的个数
     */
    public UF(int n){
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            //初始化节点，每个节点重量大小初始值为1
            parent[i] = i;
            size[i] = 1;
        }
    }

    /**将节点q和节点p连通**/
    public void union(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ){
            return;
        }
        //小树接到大树下面，比较平衡
        if(size[rootP] > size[rootQ]){
            parent[rootQ] = parent[rootP];
            size[rootP] += size[rootQ];
        }
        else{
            parent[rootP] = parent[rootQ];
            size[rootQ] += size[rootP];
        }
        //两个连通分量合并为一个连通分量
        count--;
    }

    /**判断节点q和节点p是否连通**/
    public boolean connected(int p, int q){
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    /**返回节点x的连通分量根节点**/
    private int find(int x){
        while(parent[x] != x){
            //进行路径压缩
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    /**返回图的连通分量个数**/
    public int count(){
        return count;
    }
}
