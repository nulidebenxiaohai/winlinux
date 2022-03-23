import java.util.Scanner;

public class P4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        if (weight % 2 == 0 && weight > 2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
