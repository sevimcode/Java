//Write a method that takes two Strings.
//        Check if the second String is found inside of the first String.
//        If it does, remove that part from the String, but if the second String is not in the first
//        String ask the user to enter another String to try again.
//
//


package methods;


import java.util.Scanner;

public class RemoveStringfromString{


    public static void main(String[] args){
      removeString("sevimsurucu","xya");
    }

    public static void removeString(String word1, String word2){

        Scanner input = new Scanner(System.in);

        if (word1.contains(word2)) {

            replaceAndPrint(word1,word2);

        } else {
            System.out.println("your word not found put another word ");
            word2 = input.nextLine();

            if (word1.contains(word2)) {
             replaceAndPrint(word1,word2);

            } else {
                System.out.println("out of try");

            }


        }

    }
    public static String replaceAndPrint(String word2,  String replace){
        word2 = word2.replace(replace,"");
        System.out.println(word2);
        return word2;
    }


}






