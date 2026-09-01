package hexlet.code;

import hexlet.code.games.*;

public class Engine {
    private static final int MAX_WIN=3;

    public static void engine(int numGame, String name) {
        int countWin = 0;
        String rndInt;
        String corAnsw;

        switch (numGame) {      //привила игр
            case 2:
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case 3:
            System.out.println("What is the result of the expression?");
            case 4 :
            System.out.println("Find the greatest common divisor of given numbers.");
            case 5 :
            System.out.println("What number is missing in the progression?");
            case 6 :
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
                    corAnsw = GCD.startGCD();
                }
                else if (numGame==5){
                    rndInt=Progression.rndInts();
                    corAnsw = Progression.startProgres();
                }
                else if (numGame==6){
                    rndInt= Integer.toString(Prime.rndInts());
                    corAnsw = Prime.startPrime();
                }else {
                    corAnsw="";
                    rndInt="";
                }

                System.out.println("Question: " + rndInt);
                String answer = Main.input.next();

                if (answer.equals(corAnsw)) {
                    System.out.println("Correct!");
                    countWin++;

                } else {
                    System.out.println(
                            answer + " is wrong answer ;(. Correct answer was "
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

