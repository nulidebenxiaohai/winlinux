package Demo05Map;

import java.util.HashMap;
import java.util.Map;

/*
java,util.Map<k,v>集合
Map集合的特点：
    1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个value）
    2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3.Map集合中的元素，key是不允许重复的，value是可以重复的
    4.Map集合中的元素，key和value是一一对应的

java.util.HashMap<k,v>集合 implements Map<k,v>接口
HashMap集合的特点：
    1.HashMap集合底层是哈希表：查询的速度特别的快
        JDK1.8之前：数组+单向链表
        JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
    2.hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致

LinkedHashMap的特点：
    1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
    2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
    }
    /*
    public V put(K key, V value): 把指定的键与指定的值添加到Map集合中
        返回值v：
            存储键值对的时候：key不重复，返回值V是null
            存储键值对的时候：key重复，会使用新的value替换map中重复value，返回被替换的value值
     */
    private static void show01() {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("yjh","xmy");
        System.out.println("v1:"+v1);
        System.out.println(map.get("yjh"));
        System.out.println(map.containsKey("yjh"));
    }
}
