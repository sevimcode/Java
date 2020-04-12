package methods;

public class PalindromeMethod{

    public static boolean isPalindrome(String word){

        String rev = "";
        for (int i = word.length()-1;i >= 0;i--) {

            rev += word.charAt(i);}


        if (rev.equals(word)){
            return true;
        }

          return false;
    }
        /// saim's solution
//        if (ReverseString.reverse(word).equals(word)) { // we call the reverse method with its class with ReverseString.reverse(word)
//            return true;
//        } else {
//            return false;
//        }

//    }

    public static void main(String[] args){


            if (isPalindrome("malam")) {
                System.out.println("palindrome");
            } else {
                System.out.println(" not palindrome");
            }
        }


    }
