package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Calc {
    private static final int MAX_NUM_GAME = 350;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void startCalc() {
        String description = "What is the result of the expression?";
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int num1 = (int) (Math.random() * MAX_NUM_GAME);
            int num2 = (int) (Math.random() * MAX_NUM_GAME);
            char operator = OPERATORS[(int) (Math.random() * (OPERATORS.length))];
            if (operator == '*') {
                num1 = num1 % 100;
                num2 = num2 % 100;
            }

            rounds[i][1] = Integer.toString(calculate(num1,num2,operator)); // ответ
            rounds[i][0] = num1 + " " + operator + " " + num2;
        }
        Engine.engine(description, rounds); // решение примера
    }

    public static int calculate(int num1, int num2, int operator){
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default :
                throw new RuntimeException("The selected value " + operator + " is not included in the list of operators: "
                        + Arrays.toString(OPERATORS));
        }
    }
}
