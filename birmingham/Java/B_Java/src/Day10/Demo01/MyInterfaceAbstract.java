package Day10.Demo01;
/*
在任何版本的Java中，接口都能定义抽象方法：

public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以选择性地省略。
3. 方法的三要素，可以随意定义。
 */
public interface MyInterfaceAbstract {

    public abstract void methodAbs();

    abstract void methodAbs1();

    void methodAbs2();
    //以上都行，定义抽象方法成立
}
