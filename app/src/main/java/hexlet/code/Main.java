package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Main {
    public static final String[] MENU_GAME={"Exit","Greet","Even","Calc"};
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int numGame;
        // приветствие и выбор игры
        do {
            System.out.println(
                    "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
            numGame = input.nextInt();
        } while (numGame<0 || numGame>MENU_GAME.length);

        System.out.println("Your choice: " + numGame);
        // запрос имени
        Cli.hello_user(input);
        String nameGamer = Cli.nameGamer;
        //игры
        Engine.enjine(numGame, nameGamer);
    }
}
