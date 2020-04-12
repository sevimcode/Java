package methodoverloading;

public class FirstCharacter{

    public static void firstChar(String word){

        char character = word.charAt(0);


    }
    public static void firstChar(String word, int index){

        char character = word.charAt(index);


    }
    public static int firstChar(String word, int num1, int num2){

        String word1 = word.substring(num1,num2);
        int length = word1.length();
        return length;

    }

    public static void main(String[] args){

        System.out.println(firstChar("sevim", 0, 2));
    }



}
