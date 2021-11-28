package Demo02_CollectionAndReflect;

public class Demo01GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("yujiahua");
        System.out.println(gc.getName());

        //创建GenericClass对象，泛型是使用Integer类型
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(1);
    }
}
