package Demo03_ListAndSet;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List 接口 extends Collection接口
List接口的特点：
1.有序的集合，存储元素和去除元素的顺序是一致的
2.有索引，包含了一些带索引的方法
3.允许存储重复的元素
注意：
    操作索引的时候，一定要防止索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);//不是地址，说明这里已经重写了toString方法
    }
}
