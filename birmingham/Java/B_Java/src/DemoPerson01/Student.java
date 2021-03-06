package DemoPerson01;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象的时候，其实就是在调用方法。
格式：
public 类名称（参数类型 参数名称）{
    方法体
}

注意事项：
1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
2. 构造方法不要写返回值类型，连void都不写
3. 构造方法不能return一个具体的返回值
4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数，方法体什么事情都不做。
public Student（）{}
5. 一旦编写了至少一个构造方法，那么编译器将不再赠送。
6. 构造方法也是可以进行重载的。
重载： 方法名称相同，参数列表不同。
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参数构造方法");
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("有参数构造方法");
        System.out.println(this.name + " is " + this.age + " years old.");
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
