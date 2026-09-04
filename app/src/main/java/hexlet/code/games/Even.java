package hexlet.code.games;

import hexlet.code.Engine;


public class Even {
    private static final int MAX_NUM_GAME = 120;

    public static void startEven() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[Engine.ROUNDS][2];
        int examInt;
        for (int i = 0; i < Engine.ROUNDS; i++) {
            examInt = (int) (Math.random() * MAX_NUM_GAME);

            rounds[i][0] = Integer.toString(examInt);
            rounds[i][1] = (examInt % 2 == 0) ? "yes" : "no"; // проверка четности
        }

        Engine.engine(description, rounds);
    }
}
