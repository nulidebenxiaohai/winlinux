package Day10.Demo01;
/*
问题描述：
我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题
但是这个共有方法不应该让实现类使用，应该是私有化的。

解决方法：
从Java 9 开始，接口中允许定义私有方法
1.普通私有方法，解决多个默认方法之间重复代码问题
格式：
private 返回值类型 方法名称（参数列表）{
    方法体
}
2.静态私有方法，解决多个静态方法之间重复代码问题
格式；
private static 返回值类型 方法名称（参数列表）{
    方法体
}
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("Default method 1");
    }
    public default void methodDefault2(){
        System.out.println("Default method 2");
    }
    private void methodCommon(){
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }
}
