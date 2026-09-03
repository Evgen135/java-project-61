package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    private static final int RNGE_NUM = 120; // максимальное число для игры// кол-во раундов

    public static void startEven() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS][2];
        int examInt;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            examInt = (int) (Math.random() * RNGE_NUM);
            // проверка четности
            rounds[i][0] = Integer.toString(examInt);
            rounds[i][1] = (examInt % 2 == 0) ? "yes" : "no";
        }

        Engine.engine(description, rounds);
    }
}
