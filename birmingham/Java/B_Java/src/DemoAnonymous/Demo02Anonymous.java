package DemoAnonymous;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方法
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //匿名对象使用方法
        int number = new Scanner(System.in).nextInt();
        System.out.println("This number is " + number);

        //使用匿名对象进行传参
        methodParam(new Scanner(System.in));
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("This number is " + num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
