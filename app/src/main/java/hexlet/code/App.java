package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    private static final String[] MENU_GAME = {
        "Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"
    }; // список игр

    public static void main(String[] args) {
        int numGame; // выбор игры
        Scanner input = new Scanner(System.in);

        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit""");

        System.out.print("Your choice: ");
        numGame = input.nextInt();
        System.out.println();

        switch (numGame) {
            case 1:
                Cli.hello_user(input);
                break;
            // игры
            case 2:
                Even.startEven();
                break;
            case 3:
                Calc.startCalc();
                break;
            case 4:
                GCD.startGCD();
                break;
            case 5:
                Progression.startProgression();
                break;
            case 6:
                Prime.startPrime();
                break;
            default:
                System.out.print("Exit");
        }
    }
}
