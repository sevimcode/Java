package methods;

public class ReverseString{


    public static String reverse(String word){

        String rev = "";
        for (int i = word.length()-1;i >= 0;i--) {

            rev += word.charAt(i);


        }
            return rev;

    }

    public static void main(String[] args){

        System.out.println(reverse("sevim"));

    }


}







