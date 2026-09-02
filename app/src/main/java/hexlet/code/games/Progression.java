package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static final int MAX_NUM=31;
    private static final int ROUNDS = 3;
    private static final int MIN_LENGTH=5;
    private static final int MOVE_MAX =10;

    public static void startProgression(Scanner answer) {
        String description ="What number is missing in the progression?";
        String[][] rounds= new String [ROUNDS][2];

        for(int i=0; i < ROUNDS; i++ ) {
            int length = (int) ((Math.random() * (MIN_LENGTH + 1)) + MIN_LENGTH);
            int[] numbersRow = new int[length];     //список носеров
            int num = (int) (Math.random() * MAX_NUM);       //текущий номер
            int move = (int) (Math.random() * MOVE_MAX) + 1;       //размер шага
            int numHidden = (int) (Math.random() * length);      // кол-во номеров

            for (int l = 0; l < length; l++) {
                numbersRow[l] = num;
                num += move;
            }

            StringBuilder numbersStr = new StringBuilder();
            int hidden = numbersRow[numHidden]; //ответ

            for (int j : numbersRow) {
                if (j != hidden) {
                    numbersStr.append(j);
                } else {
                    numbersStr.append("..");
                }

                if (j < numbersRow[length - 1]) {
                    numbersStr.append(" ");
                }
            }
            rounds[i][0] =numbersStr.toString();
            rounds[i][1] = Integer.toString(hidden);
        }
        Engine.engine(answer, description, rounds);
    }
}
