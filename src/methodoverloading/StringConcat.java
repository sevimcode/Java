
//Create a method that will accept two Strings. Return a new String that has the firstWord
//        then the secondWord and then the firstWord again
//        > input: “day”, “name”
//        > output: “daynameday”
//        Overload the method above to now accept the two Strings and an integer.
//        The integer given tells you how many times your first word should show up in your new String.
//        Your first words need to always be separated by the second word.
//        > input: “day”, “name”, 3
//        > output: “daynamedaynameday”
//
//

package methodoverloading;


public class StringConcat{


    public static String concatString(String firstWord, String secondWord){

        String word = firstWord+secondWord+firstWord;
      return word;
    }
    public static String concatString(String firstWord, String secondWord, int times){

        String word="";
        if (times<=0) return "";   //handling unique situation if it is invalid time amount returns empty string

        for (int i=0; i< times; i++){

            word +=firstWord;

            if (i == times-1)
                break;
            word +=secondWord;  // it does not take it at the end
        }

    return word;
    }

    public static void main(String[] args){

        System.out.println(concatString("sevim", "murat"));
        System.out.println(concatString("sevim", "KKK", 3));


    }



}
