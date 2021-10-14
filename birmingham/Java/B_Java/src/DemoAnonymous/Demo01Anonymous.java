package DemoAnonymous;
/*
创建对象的标准格式：
类名称 对象类 = new 类名称（）；

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称（）；
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Jiahua Yu";
        one.showName();

        new Person().name = "yjh";
        new Person().showName();
    }
}
