package Demo01_API;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
        直接答应对象的地址值是没有意义，需要重写Object类的toString方法
        打印对象的属性（name,age）
     */
//    @Override
//    public String toString(){
//        return "Person{name=" + name + " ,age=" + age + "}";
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
