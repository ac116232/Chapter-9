import java.util.*;

public class DoesItHaveLegs {
    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> animals = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        questions.add("Does it have legs");
        animals.add("dog");

        String userAnimal;
        String userQuestion = "";

        String giveUp = "I give up. What animal was it?";

        String userAnswer = "YES";

        while(userAnswer.equals("YES")) {
            System.out.println(animals);
            System.out.println(questions);

            int q = 0;
            int a = 0;

            while (q < questions.size()) {
                System.out.println(questions.get(q));
                userAnswer = input.nextLine().toUpperCase();

                if(userAnswer.equals("YES")) {
                    System.out.println("Is it a " + animals.get(a));
                    userAnswer = input.nextLine().toUpperCase();
                    while(a < animals.size()) {
                        if(userAnswer.equals("YES")) {
                            System.out.println("Yay! I win. Do you want to play again?");
                            userAnswer = input.nextLine().toUpperCase();
                        }
                        else if(a < animals.size()) {
                            a++;
                        }

                        else {
                            System.out.println("I give up. What animal is it?");
                            userAnimal = input.nextLine();
                            animals.add(userAnimal);
                        }
                    }

                }
                else {
                    if(q < questions.size()) {
                        q++;
                    }
                }
            }
            System.out.println("I give up. What animal is it?");
            userAnimal = input.nextLine();
            animals.add(userAnimal);


            System.out.println("Type in a question for which the answer is yes for " + animals.get(a) + " but no for " + userAnimal);
            userQuestion = input.nextLine();

            questions.add(userQuestion);

            System.out.println("Do you want to play again?");
            userAnswer = input.nextLine().toUpperCase();
        }
    }
}