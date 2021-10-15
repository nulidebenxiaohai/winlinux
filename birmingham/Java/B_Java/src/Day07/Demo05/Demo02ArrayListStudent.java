package Day07.Demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        Person one = new Person("Jiahua Yu",22);
        Person two = new Person("jiahua yu",23);
        Person three = new Person("Jiahua",24);
        Person four = new Person("jiahua",25);

        ArrayList<Person> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (Person person : list) {
            System.out.println("His name is " + person.getName() + "and he is " + person.getAge() + " years old.");
        }
    }
}
