package hexlet.code.games;

public class Progression {
    private static final int MAX_NUM=31;
    //private static final int MAX_LENGTH=10;
    private static final int MIN_LENGTH=5;
    private static final int MOVE_MAX =10;
    private static int hidden;

    public static String rndInts(){
        int length=(int)((Math.random()*(MIN_LENGTH+1)) + MIN_LENGTH);
        int[] numbersRow = new int[length];
        int num=(int)(Math.random()*MAX_NUM);
        int move=(int)(Math.random()*MOVE_MAX)+1;
        int numHidden=(int)(Math.random()*length);
        for(int i=0; i<length; i++){
            numbersRow[i]=num;
            num+=move;
        }

        StringBuilder numbersStr = new StringBuilder();
        hidden=numbersRow[numHidden]; //ответ

        for (int i : numbersRow){
            if(i != hidden) {
                numbersStr.append(i);
            }else{numbersStr.append("..");}

            if (i < numbersRow[length-1]) {
                numbersStr.append(" ");
            }
        }
        return numbersStr.toString();
    }
    public static String startProgres() {
        return Integer.toString(hidden);
    }
}
