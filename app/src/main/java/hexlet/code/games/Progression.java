package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {
    private static final int MAX_START_NUM= 31;
    private static final int MIN_LENGTH = 5;
    private static final int MOVE_MAX = 10;

    public static void startProgression() {
        String description = "What number is missing in the progression?";
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = (int) (Math.random() * MAX_START_NUM);
            int step = (int) (Math.random() * MOVE_MAX) + 1; // размер шага
            int length = (int) ((Math.random() * (MIN_LENGTH + 1)) + MIN_LENGTH);
            int numHidden = (int) (Math.random() * length); // кол-во номеров

            String[] progression = progression(num,step,length); // список номеров
            rounds[i][1] =  progression[numHidden]; //ответ
            progression [numHidden] = "..";
            rounds[i][0] = String.join(" ", progression);
        }
        Engine.engine(description, rounds);
    }

    public static String[] progression (int num, int step,int length) {
        String[] progression  = new String[length];
        for (int i = 0; i < length; i++) {
            progression [i] = Integer.toString(num);
            num += step;
        }
        return progression;
    }
}
