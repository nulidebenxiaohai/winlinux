package DataStructure.Algorithms;

public class testCharpter1_1 {
    public static void main(String[] args) {
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('b'+4));
        System.out.println(1+2+'3');
        System.out.println(3);
        System.out.println(acculate(7));
    }
    private static int acculate(int num){
        if (num == 1){
            return 1;
        }
        else{
            return num + acculate(num-1);
        }
        //return  num + acculate(num-1);
    }
}
