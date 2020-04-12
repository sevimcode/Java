package methods;

public class Palin{

    public static void main( String[] args ) {
        isPalindrome("kayk");
    }


    public static boolean isPalindrome( String word ) {

        boolean c = false;
        String newWord = "";
        for (int i = word.length() - 1;i >= 0;i--) {
            newWord += word.charAt(i) + "";
        }

        if (word.equalsIgnoreCase(newWord)) {
            System.out.println("palindrome");
            c = true;
        } else {
            System.out.println("not palindrome");
            c = false;
        }


        return c;
    }

/// another approach
    public static boolean isP( String str) {
        int start= 0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
