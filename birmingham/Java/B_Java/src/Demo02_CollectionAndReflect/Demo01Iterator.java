package Demo02_CollectionAndReflect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口：迭代器（对集合进行遍历）
有两个常用的方法：
    boolean hasNext()如果仍有元素可以迭代，则返回true
        判读集合中还有没有下一个元素，有就返回true，没有就返回false
    E next()返回迭代的下一个元素
Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现对象，获取实现列的方式比较特殊
Collection接口中有一个方法，叫做iterator()，这个方法返回的就是迭代器的实现类对象
    Iterator<E> iterator() 返回此collection的元素上进行迭代的迭代器

迭代器的使用步骤(重点)：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接受
    2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
    3.使用Iterator接口中的方法next去除结合中的下一个元素
*/
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        coll.add("e");
        /*
        Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
