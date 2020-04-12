//Create a package utilities Create a class MyCollection
// Create a static method
//        called getStringListThis method will keep asking used to enter Strings until they are done.
//        Take all the Strings they give and put them into an
//        ArrayList. Return the ArrayList after the user has entered all the information they wanted.
//        Flow:Please enter your String:
//        > Chair Do you want to enter more? Y/N
//        > YPlease enter your String:
//        > HatDo you want to enter more? Y/N> N
//        —> Returns ArrayList including: Chair and Hat
//Create a static method getIntegerList. This method does the same as getStringList,
//        but it accept numbers instead of Strings from the user
//        ——————————————————————
//        Create a static method filterList. This method accepts a String array list and a number.
//        The method will go through each element from the array list and create a new array list with
//        Strings that have the same length as the number given in the parameters
//        ——————————————————————
//        Create a static method removeDuplicates.This method accepts a
//        String array list and removes any duplicate elements.
//        The method will return an array list with only unique values

package staticpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCreating{



    private static List<String> sentence = new ArrayList<>();
    private static List<Integer> numbers = new ArrayList<>();


    public static List <String> getStringList() {

        Scanner input = new Scanner(System.in);
        sentence.clear();
        int count = 1;


        for (int i = 0;i < count;i++) {
            System.out.println("Please enter your string :");
            sentence.add(i , input.nextLine());
            System.out.println("Do you want to enter more :");
            if (input.nextLine().equals("y")) {
                count++;
            } else {
                break;
            }
        }
       return sentence;
    }



    public static List<Integer> getIntegerList(){

        Scanner input = new Scanner(System.in);
        int count = 1;

        for (int i = 0;i < count;i++) {
            System.out.println("Please enter your integer :");
            numbers.add(i , input.nextInt());
            input.nextLine();
            System.out.println("Do you want to enter more :");
            if (input.nextLine().equals("y")) {
                count++;
            } else {
                break;
            }
        }

        return numbers;
    }

    public static List<String> filterList ( List <String> sentence , int  num){

        List <String> sentence1 = new ArrayList<>() ;

        for (int i=0; i<sentence.size(); i++){

            if (sentence.get(i).length() == num){

                sentence1.add(sentence.get(i));
            }
        }

        return sentence1;

        }

    public static List<String> removeDuplicates( List <String> sentence){

        List <String> sentence1 = new ArrayList<>() ;
         int count=0;

         sentence1.add(sentence.get(0));

        for (int i = 1; i<sentence.size(); i++) {
            count=0;
            for (int j = 1;j < sentence1.size();j++) {
                if (sentence.get(i).equals(sentence1.get(j)))
                    count++;
            }
            if (count==0)
            sentence1.add(sentence.get(i));

        }

        return sentence1;
    }

    }




