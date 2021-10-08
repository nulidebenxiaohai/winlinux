import java.util.Scanner;

public class C2_labs {
    public static void main(String[] args){
        int queen_price = 125;
        int king_price = 139;
        int suite_price = 165;
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose 1 - queen,2 - king, 3 - pullout");
        int choose = input.nextInt();
        //int view = input.nextInt();
        switch (choose){
            case 1:
                System.out.printf("You have chosen queen for $%d%n", queen_price);
                System.out.println("Please choose 1 - lakeside, 2 - park view");
                int view = input.nextInt();
                if (view == 1){
                    System.out.printf("The new price is $%d", queen_price + 15);
                }
                else if (view == 2){
                    System.out.printf("The new price is $%d", queen_price);
                }
                else{
                    System.out.printf("You enter a invalid value and the price with lake view is $%d", queen_price + 15);
                }
                break;
            case 2:
                System.out.printf("You have chosen king for $%d%n", king_price);
                add(king_price);
                break;
            case 3:
                System.out.printf("You have chosen suite for $%d%n", suite_price);
                add(suite_price);
                break;
            default:
                System.out.println("Invalid code and the price is $0");
        }


    }
    public static void add(int price){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose 1 - lakeside, 2 - park view");
        int view = input.nextInt();
        if (view == 1){
            System.out.printf("The new price is $%d", price + 15);
        }
        else if (view == 2){
            System.out.printf("The new price is $%d", price);
        }
        else{
            System.out.printf("You enter a invalid value and the price with lake view is $%d", price + 15);
        }
    }
}

