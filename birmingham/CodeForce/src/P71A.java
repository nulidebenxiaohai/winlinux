import java.util.Scanner;

public class P71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //nextInt()只会读取数值，会剩下一个\n;
        int number = in.nextInt();
        //nextLine()会读取"\n"，并结束;
        in.nextLine();
        while(number > 0){
            String str = in.nextLine();
            if (str.length() <= 10){
                System.out.println(str);
            }
            else{
                String mid = str.length()-2 + "";
                System.out.println(str.charAt(0) + mid + str.charAt(str.length()-1));
            }
            number--;
        }
    }
}
