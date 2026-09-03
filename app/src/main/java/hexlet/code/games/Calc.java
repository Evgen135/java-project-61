package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int RNGE_NUM = 350; // максимальное число  для игры
    private static final char[] OPERATORS = {'+', '-', '*'}; // выбираемый оператор для вычисления

    public static void startCalc() {
        String description = "What is the result of the expression?";
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int num1 = (int) (Math.random() * RNGE_NUM);
            int num2 = (int) (Math.random() * RNGE_NUM);
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
            default:
                return num1 * num2;
        }
    }
}
