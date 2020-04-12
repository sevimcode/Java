package arrays;

public class eachWordReverse {

    public static void main ( String[] args ) {


        String str = "It started to snow in Chicago"; //   prints   "tI detrats ot wons ni ogacihC"

        String [] words = str.split(" ");

        String finalString = "";


        for(String word: words) {

            String rev = "";
            for(int i= word.length()-1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            finalString += rev + " ";

        }

        System.out.println(finalString);



//          for (int i = word.length()-1 ; i>= 0; i--){
//              rev += word.charAt(i);
//              String reverseword = ""+c;

      }
    }
















