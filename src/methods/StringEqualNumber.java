//Create a method that accepts String and int.
//        Check if string length is same as given integer.
//        Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal

package methods;

public class StringEqualNumber{

    public static void main(String[] args){

     wordEqual("sev", 3);

    }

    public static void wordEqual(String word, int len){

        if (word.length() == len){
            System.out.println("Equal");
        }else{
            System.out.println(" Not equal");
        }


    }
}
