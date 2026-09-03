package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int RNGE_NUM = 282; // максимальное число в учловии
    private static final int ROUNDS = 3; // проверяемое число

    public static void startPrime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int examNum = (int) (Math.random() * RNGE_NUM); // загаданное число

            rounds[i][0] = Integer.toString(examNum);
            rounds[i][1] = prime(examNum) ? "yes" : "no";
        }
        Engine.engine(description, rounds);
    }

    private static boolean prime(int examNum) {
        if (examNum < 2) {
            return false;
        }
        if (examNum == 2) {
            return true;
        }
        if (examNum % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(examNum); i += 2) {
            if (examNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
