package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello_user() {
        Scanner inputName = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String name = inputName.next();
        System.out.println("Hello, " + name + "!");
        inputName.close();
    }

//    public static void shoiceGame(){
//
//    }

}
