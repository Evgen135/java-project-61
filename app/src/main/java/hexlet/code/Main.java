package hexlet.code;

import java.util.Scanner;

public class Main {
    public static final String[] MENU={"Exit","Greet","Even"};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numGame;

        // приветствие и выбор игры
        do {
            System.out.println(
                    "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
            numGame = input.nextInt();
        } while (numGame != 1 && numGame != 0 && numGame != 2);
        System.out.println("Your choice: " + numGame);
        // запрос имени
        Cli.hello_user(input);
        String nameGamer = Cli.nameGamer;
        //игры
        if (MENU[numGame].equals(MENU[2])) {
            Even.StartEven(nameGamer, input);
        }
    }
}
