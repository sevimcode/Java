//4) Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
//        Loop through each elements of students. - print last character of each name on each line.
//        - Part II * Modify the loop and print the player names whose name ends with "s";
//        - Part III * Modify and print the player if it contains "s"
//        Part IV * Read the String from the user using Scanner and print out the players that contains the entered String keyword by user.
//
//




package arrays;

import java.util.Scanner;

public class FindingMembersArray {
    public static void main ( String[] args ) {


        String[] student = {"james", "Sam", "Adam", "Elize", "Benzema", "Sandy"};

        for (int i = 0; i < student.length; i++) {
            System.out.println (student[i].substring(student[i].length()-1));} // writes last characters
        System.out.println ();

        for (int i = 0; i < student.length; i++) {
            String last = student[i].substring(student[i].length()-1); // write what ends with s //you can use endsWith()
            if (last.equals("s")){
                System.out.println (student[i]);}}
        System.out.println ();

        for (int i = 0; i < student.length; i++) {  // writes what contains s

                    if (student[i].contains("s") ||student[i].contains("S") ) // or you can make it lowercase

                    System.out.println (student[i]);}


        System.out.println ();

        Scanner input = new Scanner ( System.in );


        System.out.println (" character lookin for :"); // ask use which character sequence they looking for in array
        String look = input.nextLine ();
        for (int i = 0; i < student.length; i++) {

            if (student[i].contains(look))

                System.out.println (student[i]);}



    }

        }












