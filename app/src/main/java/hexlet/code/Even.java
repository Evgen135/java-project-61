package hexlet.code;

import java.util.Scanner;

public class Even {
    public static final int MAX_WIN=3;

    public static void StartEven(String name, Scanner input) {
        int rndInt = (int) (Math.random() * 100);
        int countWin = 0;
        String corAnsw;

        while (countWin < MAX_WIN) {
            System.out.println(
                    "Answer 'yes' if the number is even, otherwise answer 'no'.\nQuestion: " + rndInt);
            String anwser = input.next();
            if (rndInt % 2 == 0) {
                corAnsw = "yes";
            } else {
                corAnsw = "no";
            }

            if (anwser.equals(corAnsw)) {
                System.out.println("Correct!");
                countWin++;
                rndInt = (int) (Math.random() * 100);

            } else {//loss
                System.out.println(
                        anwser
                                + " is wrong answer ;(. Correct answer was "
                                + corAnsw
                                + ".\nLet's try again, "
                                + name
                                + "!");
                return;
            }
        }
        //win
        System.out.println("Congratulations, " + name+ "!");
    }
}
