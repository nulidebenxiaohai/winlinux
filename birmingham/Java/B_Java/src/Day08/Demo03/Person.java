package Day08.Demo03;
/*
静态代码块的格式是：

public class 类名称 {
    static {
        //静态代码块的内容
    }
}
特点：当第一次用到本类的时候，静态代码块执行唯一的一次

 */
public class Person {
    static {
        System.out.println("Static code block! ");
    }
    public Person(){
        System.out.println("Construct method execute!");
    }
}
