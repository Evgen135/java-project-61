package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    private static final int RNGE_NUM=15;      // максимальное число для общего делителя
    private static final int ROUNDS = 3;

    public static void startGCD(Scanner answer) {
        String description ="Find the greatest common divisor of given numbers.";
        String[][] rounds= new String [ROUNDS][2];
        for(int i=0; i < ROUNDS; i++ ) {

            int divider = (int) (Math.random() * RNGE_NUM);
            int numA = ((int) (Math.random() * RNGE_NUM)) * divider;
            int numB = ((int) (Math.random() * RNGE_NUM)) * divider;

            rounds[i][0]= numA + " " + numB;

            while (numB != 0) {
                int hun = numB;
                numB = numA % numB;
                numA = hun;
            }

            rounds[i][1]=Integer.toString(numA);

        }
        Engine.engine(answer, description, rounds);
    }
}
