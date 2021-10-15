package Day07.Demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReutrn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100)+1);
        }
        System.out.println("The list is: " + list);
        System.out.println("==================");
        System.out.println("The even number list is: " + printList(list));
    }
    public static ArrayList<Integer> printList(ArrayList<Integer> random){
        ArrayList<Integer> even_number = new ArrayList<>();
        for (int i = 0; i < random.size(); i++) {
            if (random.get(i) % 2 == 0){
                even_number.add(random.get(i));
            }
        }
        return even_number;
    }
}
