package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

public class Engine {
    private static final int MAX_WIN=3;

    public static void engine(int numGame, String name) {
        int countWin = 0;
        String rndInt;
        String corAnsw;

        if (numGame==2){
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }

        if(numGame==3){
            System.out.println("What is the result of the expression?");
        }

        if(numGame==4) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }

            while(countWin<MAX_WIN) {
                if (numGame==2) {
                    rndInt=Integer.toString(Even.rndInt());
                    corAnsw = Even.startEven();
                }
                else if (numGame==3){
                    rndInt=Calc.rndInts();
                    corAnsw = Calc.startCalc();
                }
                else if (numGame==4){
                    rndInt=GCD.rndInts();
                    corAnsw = GCD.startCalc();
                } else {
                    corAnsw="";
                    rndInt="";
                }

                System.out.println("Question: " + rndInt);
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

