package replit;

import java.util.Scanner;

public class FindVowelorConsonant {

    public static void main ( String[] args ) {


        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length= str.length();
        if (length!=1){
            System.out.println ("ERROR. It should be exactly 1 character length!");

        }else{

        char ch1=str.charAt(0);

            switch(ch1)
            {
                case  'a' :
                case 'e'  :
                case 'i'   :
                case 'o'  :
                case 'u'  :
                case  'A' :
                case 'E'  :
                case 'I'   :
                case 'O'  :
                case 'U'  :

                    System.out.println("Input letter is Vowel");
                break;
                    default:

                    System.out.println("Input letter is Consonant");

            }}






}}
