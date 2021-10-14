package Day07.Demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("Jiahua Yu", 22);
        Person two = new Person("jiahua yu", 23);
        Person three = new Person("yjh", 25);

        array[0] = one; //convey the address of "one" to value of array[0]
        array[1] = two;
        array[2] = three;

        System.out.println(array[1].getName());
    }


}
