package alearning;

import java.util.Scanner;

public class learningStringsManipulations {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine ();

        char c = word.charAt(8); // finds char at  index number "8" c : r
        System.out.println (c);

        int i = word.indexOf ( " " ); //finds space first occurrence index number i : 5
        System.out.println (i);

        int j = word.indexOf ('s'); // finds 's' characters first occurrence index number
        System.out.println (j);

       //calculate how many character in the string returns integer
        int length = word.length();
        System.out.println (length);

        boolean check = word.equalsIgnoreCase ( "sevim" ); //compare strings returns boolean with ignoring cases
        System.out.println (check);
        boolean check1 = word.equals ( "sevim" ); //compare strings returns boolean
        System.out.println (check1);
        boolean check2 = word.contains ( "a" ); // finds the string in the word returns boolean
        System.out.println (check2);
        boolean check3 = word.isEmpty (); //looks the string empty or not
        System.out.println (check3);
        boolean check4 = word.startsWith ( "s" ); //looks first string is argument string returns boolean
        System.out.println (check4);
        boolean check5 = word.endsWith ( "s" ); //looks first string is argument string returns boolean
        System.out.println (check5);
        boolean check6 = word.contains ( "su" ); //looks word has this char sequence

        String front = word.substring ( 0, 1 ); // takes first character of the word
        char front1 = word.charAt(0); // takes last character of the word as char
        String back = word.substring ( length - 1 ); // takes last character of the word
        char back1 = word.charAt(word.length()-1); // takes last character of the word as char
        String word1 = word.substring ( 3 ); //takes rest of the string from word beginning from index number 3
        String word2 = word.substring ( 3,8 ); //takes string from word beginning from index number 3 to 7
        String word3 = word.substring ( length/2 ); //for even number of characters start from middle gets rest
        //for odd number of characters starts from one character before the middle takes the rest
        String word4 = word.substring ( 0,length/2 ); //takes first half of the word
        String word5 = word.substring (length/2,length/2+1); //for odd words takes the middle characters
        String word6 = word.replace("u","e"); // change the character old to new
        String word7 = word.replace("u",""); // removes u put nothing instead of new char
        String word8 = word.toUpperCase (); // make the word uppercase
        String word9 = word.toLowerCase (); // make the word lowercase
        String word10 = String.valueOf ( c ); // gives string value of char c
        char letter = input.nextLine ().toUpperCase ().trim ().charAt ( 0 ); // first character from nextline input

        int a = Integer.valueOf(word); // gives integer value of the String string should be numbers
        double b = Double.valueOf ( word );// gives double value of the String string should be numbers
        char [] c1 = word.toCharArray();  // it makes the word characters and make an array from them
      // character.isDigit(char c); checks whether char is number or not returns boolean


    }


}
