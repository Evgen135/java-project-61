package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void hello_user(){
        Scanner input_name = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String name = input_name.next();
        System.out.println("Hello, " + name + "!");
        input_name.close();
    }
}
