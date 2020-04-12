package scanners;

import java.util.Scanner;

public class Summarize {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Addition :");

        System.out.print("Type your first number :");
        int number1 = keyboard.nextInt();

        System.out.print("Type your second number :");
        int number2 = keyboard.nextInt();

        System.out.println(number1 + number2);

    }

}
