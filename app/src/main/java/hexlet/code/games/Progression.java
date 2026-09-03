package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {
    private static final int MAX_NUM = 31;
    private static final int MIN_LENGTH = 5;
    private static final int MOVE_MAX = 10;

    public static void startProgression() {
        String description = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int length = (int) ((Math.random() * (MIN_LENGTH + 1)) + MIN_LENGTH);
            String[] numbersRow = new String[length]; // список номеров
            int num = (int) (Math.random() * MAX_NUM); // текущий номер
            int move = (int) (Math.random() * MOVE_MAX) + 1; // размер шага
            int numHidden = (int) (Math.random() * length); // кол-во номеров

            for (int l = 0; l < length; l++) {
                if (l!=numHidden) {
                    numbersRow[l] = Integer.toString(num);
                    num += move;
                } else {
                    numbersRow[l] = "..";
                    rounds[i][1] =  Integer.toString(num); //ответ
                    num += move;
                }
            }
            rounds[i][0] = String.join(" ", numbersRow);
        }
        Engine.engine(description, rounds);
    }

}
