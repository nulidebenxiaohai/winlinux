package DemoScanner;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter thee second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of two number is " + (a + b));
    }
}
