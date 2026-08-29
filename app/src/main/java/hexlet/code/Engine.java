package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Engine {
    private static final int MAX_WIN=3;

    public static void enjine(int numGame, String name) {
        int countWin = 0;
        int rndInt;
        String corAnsw;

        if (numGame==2){
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }

        if(numGame==3){
            System.out.println("What is the result of the expression?");
        }

            while(countWin<MAX_WIN) {
                if (numGame==2) {
                    System.out.println("Question: " + Even.rndInt());
                    corAnsw = Even.startEven();
                }
                if (numGame==3){
                    System.out.println("Question: " + Calc.rndInts());
                    corAnsw = Calc.startCalc();
                } else{corAnsw=" ";}

                String anwser = Main.input.next();

                if (anwser.equals(corAnsw)) {
                    System.out.println("Correct!");
                    countWin++;

                } else {
                    System.out.println(
                            anwser + " is wrong answer ;(. Correct answer was "
                                    + corAnsw
                                    + ".\nLet's try again, "
                                    + name
                                    + "!");
                    return;
                }
            }
            System.out.println("Congratulations, " + name+ "!");
    }

}

