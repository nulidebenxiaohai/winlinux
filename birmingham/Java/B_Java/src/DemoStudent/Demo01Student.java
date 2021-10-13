package DemoStudent;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Jiahua Yu");
        stu1.setAge(22);
        System.out.println("Name: " + stu1.getName() + " Age: " + stu1.getAge());
        System.out.println("================");

        Student stu2 = new Student("yjh",18);
        System.out.println("Name: " + stu2.getName() + " Age: " + stu2.getAge());
    }
}
