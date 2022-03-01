package Search;

public class BlackRedTree<Key extends Comparable<Key>, Value> {
    /**
     * 红黑树节点表示
     */
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private class Node{
        Key key;
        Value val;
        Node left, right;
        int N;
        boolean color;
        Node(Key key, Value val, int N, boolean color){
            this.key = key;
            this.val = val;
            this.N = N;
            this.color = color;
        }
    }

    /**
     * 判断一个节点是否是红/黑
     * @param x
     * @return
     */
    private boolean isRed(Node x){
        if(x == null){
            return false;
        }
        return x.color == RED;
    }
    /**
     * 左旋转h的右链接
     */
    Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        h.N = 1+size(h.left)+size(h.right);
        return x;
    }
    /**
     *  右旋转h的左链接
     */
    Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        h.N = 1+size(h.left)+size(h.right);
        return x;
    }
    /**
     * 颜色转换：一个节点的两个红色子节点的颜色，将子节点的颜色从红变黑
     * 父节点的颜色由黑变红
     */
    private void filpColors(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }
    /**
     * 返回Node的子节点个数(包括自身)
     * @param x
     * @return
     */
    private int size(Node x){
        if(x == null) {
            return 0;
        }
        else {
            return x.N;
        }
    }

    private Node root;

    public void put(Key key, Value val){
        //查找key, 找到则更新其值，否则就为它新建一个节点
        root = put(root, key, val);
        root.color = BLACK;
    }

    /**
     * 红黑树的插入算法
     * @param h
     * @param key
     * @param val
     * @return
     */
    private Node put(Node h, Key key, Value val){
        //标准的插入操作，和父节点用红链接相连
        if(h == null){
            return new Node(key, val, 1, RED);
        }
        int cmp = key.compareTo(h.key);
        if(cmp < 0){
            h.left = put(h.left, key, val);
        }
        else if(cmp > 0){
            h.right = put(h.right, key, val);
        }
        else{
            h.val = val;
        }

        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        else if(isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
            //转换完成后可以用颜色反转来处理
        }
        else if(isRed(h.left) && isRed(h.right)){
            filpColors(h);
        }
        h.N = size(h.left)+size(h.right)+1;
        return h;
    }
}


