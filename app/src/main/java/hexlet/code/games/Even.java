    package hexlet.code.games;

    import hexlet.code.Engine;
    import java.util.Scanner;

    public class Even {
        private static final int RNGE_NUM=120;      // максимальное число для игры
        private static final int ROUNDS = 3;       //кол-во раундов

        public static void startEven(Scanner answer) {
            String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
            String[][] rounds= new String [ROUNDS][2];
            int examInt;
            for(int i=0; i<ROUNDS; i++ ) {
                examInt = (int) (Math.random() * RNGE_NUM);
                //проверка четности
                rounds[i][0] =Integer.toString(examInt);
                rounds[i][1] = (examInt % 2 == 0) ? "yes" : "no";
            }

            Engine.engine(answer, description, rounds);
        }
    }

