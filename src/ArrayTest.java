import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){
        int total = 0;
        float mean = 0;
        int num = 0;
        int a = 0;
        int exit = 999;
        int addNum;

        ArrayList<Integer> list = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter number " + (a++) + " or enter 999 to exit >>> ");
            addNum = keyboard.nextInt();
            list.add(addNum);
            total = total + list.get(num);

        } while (keyboard.nextInt() != exit);

        mean = total / list.size();

        display(list);
        System.out.println("");
        System.out.println("The mean is " + mean);
        System.out.println("The total is " + total);
    }

    public static void display(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) - 1 + " ");
        }
    }
}