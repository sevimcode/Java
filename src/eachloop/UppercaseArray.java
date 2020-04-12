
//2) Given a String array with value of:
//        "Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
//        Print out how many of the words begin with uppercase letters

package eachloop;

public class UppercaseArray {

    public static void main ( String[] args ) {

        String[] fruit = { "Bread" , "cucumber" , "Apples" , "Orange" , "cookies" , "Cake" };
        int count = 0;
        for (String f : fruit) {
            for (int i = 65;i < 91;i++) { // if (Character.isUppercase(f.charAt(0));  another way
                if (f.charAt (0) == i) {
                    count++;
                }

            }


        }

        System.out.println (count);


    }
}