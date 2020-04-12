package scanners;

import java.util.Scanner;

public class Wall {
    public static void main ( String[] args ) {

    Scanner input = new Scanner (System.in);
        System.out.println ("what is the wall color  :");
        String color = input.nextLine();
        System.out.println ("what is the length ? :");
        int length = input.nextInt();
        System.out.println ("is it good one?  :");
        input.nextLine();                      // you need to return back to nextLine() you need to break the line
        String answer = input.nextLine();           //after taking integer from console

        System.out.println ("Color  : " + color);
        System.out.println ("Length : " + length);
        System.out.println ("Good? : "  + answer);
}
}
