package Day10.Demo02;
/*
使用接口的时候，需要注意：

1.接口是没有静态代码块或者构造方法的
2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    //覆盖重所有抽象方法
}
3.如果实现类所实现的多个接口中，存在重复的抽象方法，那么只需要覆盖重写一次即可
 */
public class Demo01Interface {
}
