package hexlet.code.games;

public class GCD {
    private static final int RNGE_NUM=15;
    private static int numA;
    private static int numB;
    private static int divider;
    public static String rndInts() {

        divider =(int) (Math.random() * RNGE_NUM);
        numA = ((int) (Math.random() * RNGE_NUM))*divider;
        numB = ((int) (Math.random() * RNGE_NUM))*divider;

        return numA + " " + numB;
    }

    public static String startGCD() {
        while(numB>0) {
            int hun=numB;
            numB = numA % numB;
            numA=hun;
        }
        return Integer.toString(numA);

    }
}
