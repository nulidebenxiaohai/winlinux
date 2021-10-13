public class Persion {
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
