package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello_user(Scanner input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String nameGamer = scanner.next();
        System.out.println("Hello, " + nameGamer + "!");
        scanner.close();
    }

}
