import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main (String [] args){
        ArrayList<String> names = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        String addName;
        System.out.println("Please enter 5 names.");
        for(int j = 0; j < 5; ++j){
            System.out.println("Enter" + j + "name :");
            addName = keyboard.next();
            names.add(addName);
        }

        names.add( 0, "Sam");
        names.remove(3);
        display(names);
    }
    public static void display(ArrayList<String> names){

        System.out.println("The size of the list is " + names.size());
        for(int i = 0; i < names.size(); ++i){
            System.out.println("Position: "+ i + "Name: " + names.get(i));
        }
    }
}
