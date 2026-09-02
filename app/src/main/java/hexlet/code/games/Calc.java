package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    private static final int RNGE_NUM=350;      // максимальное число  для игры
    private static final int ROUNDS = 3;
    private static final char[] OPERATORS={'+','-','*'};     //выбираемый оператор для вычисления

    public static void startCalc(Scanner answer) {
        String description = "What is the result of the expression?";
        String[][] rounds= new String [ROUNDS][2];

        for(int i=0; i<ROUNDS; i++ ) {

            int num1=(int) (Math.random() * RNGE_NUM);
            int num2=(int) (Math.random() * RNGE_NUM);
            char operator = OPERATORS[(int) (Math.random() * (OPERATORS.length)) ];
            if (operator=='*'){
                num1=num1%100;
                num2=num2%100;
            }

            int corAnsw;
            switch (operator) {
                case '+':
                    corAnsw = num1 + num2;
                    break;
                case '-':
                    corAnsw = num1 - num2;
                    break;
                default:
                    corAnsw = num1 * num2;
                    break;
            }
            rounds[i][1]=Integer.toString(corAnsw);
            rounds[i][0] = num1 + " " + operator + " " + num2;
        }
        Engine.engine(answer, description, rounds);       //решение примера
    }
}
