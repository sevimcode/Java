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

package utilities;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MyCollection{



    private static List<String> words = new ArrayList<>();
    private static List<Integer> numbers = new ArrayList<>();

    /**
     * This method creates list of strings from the users
     * Method uses scanner for input
     * @return  List of String
     */

    public static List <String> getStringList() {

        Scanner input = new Scanner(System.in);
        words.clear();
        int count = 1;


        for (int i = 0;i < count;i++) {
            System.out.println("Please enter your string :");
            words.add(i , input.nextLine());
            System.out.println("Do you want to enter more Y/N:");
            if (input.nextLine().equals("y")) {
                count++;
            } else {
                break;
            }
        }
       return words;
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

        List <String> newWords = new ArrayList<>() ;
         int count=0;

         newWords.add(sentence.get(0));

        for (int i = 1; i<sentence.size(); i++) {
            count=0;
            for (int j = 1;j < newWords.size();j++) {
                if (sentence.get(i).equals(newWords.get(j)))
                    count++;
            }
            if (count==0)
            newWords.add(sentence.get(i));


        }

        return newWords;
    }

    public static List<String> removeDuplicates1( List <String> sentence){
        List <String> newWords = new ArrayList<>() ;


        for (String s : sentence){
            if (!newWords.contains(s)){
                newWords.add(s);
            }

        }

        return newWords;

    }
    public static ArrayList<String> randomArrayList(int elements) {
        ArrayList <String> words = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i < elements; i++) {
            int size = random.nextInt(10) + 1;
            String temp = "";
            for(int j= 0; j < size; j++) {
                int characters = random.nextInt(23) + 65;
                temp += (char)characters;
            }
            words.add(temp.toLowerCase());
        }
        return words;
    }


    }




