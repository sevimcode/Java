package strings;

public class ReverseTheSentence{
    public static void main( String[] args ) {


        String s = "We have a picnic today";
        String reversed ="";

        for (int i=s.length()-1; i>=0; i--){

            reversed += s.charAt(i);
        }

        System.out.println("My reversed sentence is : " + reversed);
    }
}