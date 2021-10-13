package DemoPerson;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("余佳华");
        stu.setAge(22);
        stu.setMale(true);
        System.out.printf("His name is %s and he is %d years old. He is %s", stu.getName(),stu.getAge(),stu.isMale());
    }
}
