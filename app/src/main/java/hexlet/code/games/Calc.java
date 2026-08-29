package hexlet.code.games;

public class Calc {
    private static final int RNGE_NUM=350;      // максимальное число  для игры
    private static final char[] OPERATORS={'+','-','*'};
    private static int num1;
    private static int num2;
    private static char operator;

    public static String rndInts() {
        num1=(int) (Math.random() * RNGE_NUM);
        num2=(int) (Math.random() * RNGE_NUM);
        operator = OPERATORS[(int) (Math.random() * (OPERATORS.length)) ];
        return num1 + " " + operator + " " + num2;
    }

    public static String startCalc() {

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
        return Integer.toString(corAnsw);
    }
}
