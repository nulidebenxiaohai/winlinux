public class DemoPerson {
    public static void main(String[] args) {
        Persion person = new Persion();
        person.show();

        person.name= "Jiahua Yu";
        person.setAge(22);
        person.show();
        int name = person.getAge();
        System.out.println(name);
    }
}
