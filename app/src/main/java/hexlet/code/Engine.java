package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void engine(String description, String[][] rounds) {
        Scanner answer = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = answer.next();
        System.out.println("Hello, " + name + "!\n" + description);

        for (String[] round : rounds) {

            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = answer.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");

            } else {
                System.out.println(
                        userAnswer
                                + " is wrong answer ;(. Correct answer was "
                                + correctAnswer
                                + ".\nLet's try again, "
                                + name
                                + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        answer.close();
    }
}
