package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int RNGE_NUM = 15; // максимальное число для общего делителя

    public static void startGCD() {
        String description = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int divider = (int) (Math.random() * RNGE_NUM); // 1 чтоб небло =0
            int numA = ((int) (Math.random() * RNGE_NUM) + 1) * divider;
            int numB = ((int) (Math.random() * RNGE_NUM) + 1) * divider;

            rounds[i][0] = numA + " " + numB;

            rounds[i][1] = Integer.toString(corAnsw(numA, numB));
        }
        Engine.engine(description, rounds);
    }
    public static int corAnsw(int numA,int numB){
            while (numB != 0) {
                int hun = numB;
                numB = numA % numB;
                numA = hun;
            }
            return numA;
    }

}
