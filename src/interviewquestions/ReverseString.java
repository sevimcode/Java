package interviewquestions;


public class ReverseString{


    public static String reverse(String str){
        String reversed ="";

        for (int i = str.length()-1 ; i>=0 ; i--){
            reversed += str.charAt(i)+"";
        }

        return reversed;
    }


    public static String reverse2(String str){

        return new StringBuilder(str).reverse().toString();
    }


     public static boolean isPalindrome(String str)
     {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--)
            reversed += str.charAt(i);
        return str.equals(reversed);
      }



    public static void main( String[] args ) {
        System.out.println(reverse("sevim"));
        System.out.println(reverse2("sevim"));
        System.out.println(isPalindrome("mivim"));
    }

}
