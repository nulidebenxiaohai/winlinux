package DemoAnonymous;
/*
创建对象的标准格式：
类名称 对象类 = new 类名称（）；

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称（）；

注意事项：匿名对象只能使用唯一的一次。下次再用不得不再创建一个新对象
使用建议：若确定只使用对象一次，就可以使用匿名对象。
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
