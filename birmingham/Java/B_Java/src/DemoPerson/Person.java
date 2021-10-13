package DemoPerson;
/*
必须叫setXxx或者getXxx命名规则。
对于Getter来说，不能有参数，返回值类型和成员变量对应
对于Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("My name is " + name + ", and my age is " + age);
    }
    public void setAge(int num){
        if (num < 100 && num > 0){
            age = num;
        }
        else{
            System.out.println("The value is invalid");
        }
    }

    public int getAge(){
        return age;
    }
}
