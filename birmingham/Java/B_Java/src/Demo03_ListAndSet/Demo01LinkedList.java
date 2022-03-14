package Demo03_ListAndSet;

import java.util.LinkedList;

/**
java.util.LinkedList集合 implements List接口
LinkedList集合的特点：
    1.底层是一个链表结构：查询慢，增删快
    2.里面包含了大量操作首尾元素的方法
    注意：使用LinkedList集合特有的方法，不能使用多态

 */
public class Demo01LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
    }
    private static void show01(){
        //创建LinkedList集合对象
        LinkedList<String> lined = new LinkedList<>();
        //使用add方法往集合中添加元素
        lined.add("a");
        //将指定元素插入此列表的开头
        lined.addFirst("www");
        System.out.println(lined);
        //与addFirst方法等效
        lined.push("bbb");
        System.out.println(lined);
        //将指定元素添加到此列表的结尾，相当于add（）方法
        lined.addLast("bcd");
        System.out.println(lined);
    }
    private static void show02(){
        System.out.println("---------------");
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往列表中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String first = linked.getFirst();
        System.out.println(first);
        String last = linked.getLast();
        System.out.println(last);


        System.out.println(linked.removeFirst());
        System.out.println(linked.removeLast());
        System.out.println(linked);
        //pop()方法：从此列表中所表示的堆栈中弹出第一个元素。此方法相当于是removeFisrt();
    }
}
