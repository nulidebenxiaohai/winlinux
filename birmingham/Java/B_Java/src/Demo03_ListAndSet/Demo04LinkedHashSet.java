package Demo03_ListAndSet;


import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
java.util.LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
    底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("com");
        System.out.println(linked);//有序，不允许重复
    }
}
