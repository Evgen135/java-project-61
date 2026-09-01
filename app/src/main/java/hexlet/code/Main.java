package hexlet.code;

import java.util.Scanner;

public class Main {
    public static final String[] MENU_GAME={"Exit","Greet","Even","Calc","Progression","Prime"};//список игр
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int numGame;        // выбор игры
        do {
            System.out.println("""
                            Please enter the game number and press Enter.
                            1 - Greet
                            2 - Even
                            3 - Calc
                            4 - GCD
                            5 - Progression
                            6 - Prime
                            0 - Exit""");
            numGame = input.nextInt();
        } while (numGame<0 || numGame>MENU_GAME.length);    //повтор выбора в случае не верного ввода

        System.out.println("Your choice: " + numGame);

        Cli.hello_user(input);      // приветсвие
        String nameGamer = Cli.nameGamer;       //запрос имени
        //игры
        if (numGame!=(1)){
            Engine.engine(numGame, nameGamer); //класс с вызовом логики выбранной игры
        }
    }
}
