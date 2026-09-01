package hexlet.code.games;

public class Prime {
    private static final int RNGE_NUM=282;      //максимальное число в учловии
    private static  int examNum;        //проверяемое число

    public static int rndInts() {
        examNum= (int) (Math.random() * RNGE_NUM);        //загаданное число
        return examNum;
    }

    public static String startPrime() {
        if (examNum < 2) {
            return "no";
        }
        if (examNum == 2) {
            return "yes";
        }
        if (examNum % 2 == 0) {
            return "no";
        }
        for (int i = 3; i <= Math.sqrt(examNum); i += 2) {
            if (examNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
