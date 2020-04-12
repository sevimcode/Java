package switchexamples;

public class SwitchCompareString {

    public static void main ( String[] args ) {


        String fruit = "apple";
        switch (fruit) {
            case "oranges":
                System.out.println ("oranges are sweet");
                break;

            case "banana":

            case "apple":
                System.out.println ("My favorite");
                break;
            default:
                System.out.println ("it is not a fruit");

        }


    }

}
