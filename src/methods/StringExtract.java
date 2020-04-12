//About 293,329,202 results (0.78 seconds)
//        Write a method that extracts the result number and returns it as only numbers
//        Write a method that takes the extracts the result time and returns it as a number and the seconds
//
//


        package methods;


public class StringExtract{

    public static String extract (String sentence){

        String numbers = "";
        int bracket = sentence.indexOf("(");
        String rest = sentence.substring(bracket);
        sentence = sentence.replace(rest , "");

        char[] c1 = sentence.toCharArray();

        for (int i = 0;i < sentence.length();i++) {

            if (c1[ i ] >= '0' && c1[ i ] <= '9') {
                numbers += c1[ i ] + "";
            }
          numbers= numbers.replace(",","");
        }
        return numbers;
    }

    public static String extractSecond(String sentence){
        String second = "";
        String numbers = "";
        int bracket = sentence.indexOf("(");
        int bracket1 = sentence.indexOf(" seconds)");
        sentence = sentence.trim().substring(bracket+1,bracket1);

        return sentence;}


    public static void main(String[] args){

        System.out.println(extract("About 293,329,202 results (0.78 seconds)"));

        System.out.println(extractSecond("About 293,329,202 results (0.78 seconds)"));


    }






}
