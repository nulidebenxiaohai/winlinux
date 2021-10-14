package Day07.Demo03;

import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;//[1, 100]

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please guess a number: ");
            int guess_number = sc.nextInt();
            if (guess_number < number){
                System.out.println("The number you guess is too small! ");
            }
            else if (guess_number > number){
                System.out.println("T≠he number you guess is too large! ");
            }
            else {
                System.out.println("Congratulations! You are right! ");
                break;
            }
        }
        System.out.println("Game over!");
    }
}
