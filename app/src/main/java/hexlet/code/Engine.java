package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_WIN=3;

    public static void engine(Scanner answer, String description, String[][] rounds) {

        System.out.print("Welcome to the Brain Games!\nMay I have your name?");
        String name = answer.next();
        System.out.println("Hello, " + name + "!\n"+description);

        for(String[] round : rounds) {

            String question = round[0];
            String corAnsw = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String uaserAnswer = answer.next();

            if (uaserAnswer.equals(corAnsw)) {
                System.out.println("Correct!");

            } else {
                System.out.println(
                        uaserAnswer + " is wrong answer ;(. Correct answer was "
                                + corAnsw
                                + ".\nLet's try again, "
                                + name
                                + "!");
                return;
            }
        }
        System.out.println("Congratulations,"+ name + "!");
    }
}

