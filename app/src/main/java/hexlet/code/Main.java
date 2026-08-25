package hexlet.code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputGame = new Scanner(System.in);
        int numGame ;
        //приветствие и выбор игры
        do  {
            System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit");
            numGame = inputGame.nextInt();
        } while (numGame != 1 && numGame != 0);
        System.out.println("Your choice: " + numGame);
        // запрос имени
        System.out.println("Welcome to the Brain Games!");
        Cli.hello_user();
    }
}