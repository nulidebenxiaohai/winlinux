package Demo02_CollectionAndReflect;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection接口
    所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法
    }
}
