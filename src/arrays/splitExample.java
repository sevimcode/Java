// find the biggestlength of the word in the string

package arrays;



public class splitExample {

    public static void main ( String[] args ) {
        int biggestlength = 0;
        String str = "ayse fatma hayriye zekiyehdhfghfhf";
        String[] arr = str.trim().split(" ");


        for (String word : arr) {
            if (word.length() > biggestlength) { // finds the biggest one and put into biggestlength
                biggestlength = word.length();
            }
        }


        for (String word : arr) {
            if (word.length() == biggestlength) { // compare after fist loop
                System.out.println(word);

            }
        }

    }


}



