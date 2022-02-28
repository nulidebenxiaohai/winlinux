package Regex;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] s = str.replaceAll("[^0-9]", ",").split(",");
            for(String ss : s){
                System.out.print(ss + " ");
            }
            System.out.println();
        }
    }
}
