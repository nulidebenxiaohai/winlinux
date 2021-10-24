package Day09.Demo13;
/*
子类也是一个抽象类
 */
public abstract class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog eats bones");
    }

}
