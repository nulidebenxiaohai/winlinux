package Search;

public class BST <Key extends Comparable<Key>, Value>{
    private Node root;
    private class Node{
        private Key key;
        private Value val;
        private Node left, right;
        private int N;
        public Node(Key key, Value val, int N){
            this.key = key;
            this.val = val;
            this.N = N;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x == null) {
            return 0;
        }
        else {
            return x.N;
        }
    }

    public Value get(Key key){
        return get(root, key);
    }

    private Value get(Node x, Key key){
        if(x == null){
            return null;
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            return get(x.left, key);
        }
        else if(cmp > 0){
            return get(x.right, key);
        }
        else{
            Value val = x.val;
            return val;
        }
    }

    public void put(Key key, Value val){
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val){
        if(x == null){
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            x.left = put(x.left, key, val);
        }
        else if(cmp > 0){
            x.right = put(x.right, key, val);
        }
        else {
            x.val = val;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key min(){
        return min(root).key;
    }

    private Node min(Node x){
        if(x.left == null){
            return x;
        }
        return min(x.left);
    }

    /**
     * floor函数向下取整
     * @param key
     * @return
     */
    public Key floor(Key key){
        Node x = floor(root, key);
        if(x == null){
            return null;
        }
        return x.key;
    }
    private Node floor(Node x, Key key){
        if(x == null){
            return null;
        }
        int cmp = key.compareTo(x.key);
        if(cmp == 0){
            return x;
        }
        if(cmp < 0){
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if(t != null){
            return t;
        }
        else{
            return x;
        }
    }
    /**
     * 二叉查找树中select()和rank()方法的实现
     *   ran（）是select()的逆方法，它会返回定键的排名。
     */
    public Key select(int k){
        return select(root, k).key;
    }
    private Node select(Node x, int k){
        //返回排名为k的节点
        if(x == null){
            return null;
        }
        int t = size(x.left);
        if(t > k){
            return select(x.left, k);
        }
        else if(t < k){
            return select(x.right, k-t-1);
        }
        else {
            return x;
        }
    }

    public int rank(Key key){
        return rank(key, root);
    }
    private int rank(Key key, Node x){
        //返回以x为跟节点的子树中小于x.key的键的数量
        if(x == null){
            return 0;
        }
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            return rank(key, x.left);
        }
        else if(cmp > 0){
            return 1+size(x.left)+rank(key, x.right);
        }
        else{
            return size(x.left);
        }
    }
}
