package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String nameGamer;

    public static void hello_user(Scanner input) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        nameGamer = input.next();
        System.out.println("Hello, " + nameGamer + "!");
    }

    //    public static void shoiceGame(){
    //
    //    }

}
