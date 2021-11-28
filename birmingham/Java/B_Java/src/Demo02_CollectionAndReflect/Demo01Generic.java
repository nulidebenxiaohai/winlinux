package Demo02_CollectionAndReflect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/*
创建集合对象，不适用泛型
好处：
    集合不适用泛型，默认的类型就是Object类型，可以存储任意类型的数据
弊端：
    不安全，会引发异常
 */
/*
创建集合对象，使用泛型
好处：
    1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    2.把运行期异常（代码运行之后会抛出的异常），提升到了编译器（写代码的时候会报错）
弊端：
    泛型是什么类型，只能存储什么类型的数据
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
