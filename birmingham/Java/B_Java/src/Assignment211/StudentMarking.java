package Assignment211;

import java.util.Scanner;

public class StudentMarking {
    //ReadData r=new ReadData();

    Scanner input=new Scanner(System.in);

//Scanner input=new Scanner("abc 123 bb ss");

    String s=input.nextLine();

    String[] arr=s.split(" ");

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//Scanner input=new Scanner("abc 123 bb ss");

        String s=input.nextLine();
        char n = '*';
        String[] arr=s.split(" ");
        System.out.println(s.split(" ")[0]);
        //System.out.println(s.split(" ")[1]);
        String given_name = s.split(" ")[0];
        System.out.println(given_name.charAt(0));
        String list = String.valueOf(new char[]{'w','s','s'});
        System.out.println(list);
        int num = 10;
        System.out.println(String.valueOf(num));
        System.out.println(s);
        System.out.printf("%4c",n);
        double[] lis =new double[10];
        for (int i = 0; i < lis.length; i++) {
            System.out.println(lis[i]);
        }

    }

}

