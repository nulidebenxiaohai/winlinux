package Demo05_ExceptionAndError;
/*
java.lang.Throwable:类是Java语言中所有错误或异常的超类
     Exception：
         编译器异常，进行编译（写代码）java程序出现的问题
     Error：错误
         错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
