    package hexlet.code.games;


    public class Even {
        private static final int RNGE_NUM=120;       // максимальное число для игры
        private static  int examInt;

        public static int rndInt() {
            examInt= (int) (Math.random() * RNGE_NUM);        //загаданное число
            return examInt;
        }

        public static String startEven() {
                //проверка четности
                return (examInt% 2 == 0) ? "yes" : "no";

        }
    }

