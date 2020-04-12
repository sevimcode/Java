//About 97,400,000 results (0.59 seconds) give 97400000

        package strings;



public class FormattingString{
    public static void main( String[] args ) {
        System.out.println(resultCount("About 97,400,000 results (0.59 seconds)" ));
        System.out.println(resultTime("About 97,400,000 results (0.59 seconds)" ));
    }



    public static String resultCount(String word){


        String str = "";
        String newWord="";
       int k = word.indexOf('(');
        newWord= word.substring(0,k+1);
        for (int i =0; i<newWord.length() ; i++){
            if(newWord.charAt(i)>='0' && newWord.charAt(i)<='9')
                str += newWord.charAt(i);
        }
        return str;
    }
//another approach
    public static String resultC(String str){

        String [] arrStr = str.split(" ");
        String secondWord = arrStr[1];
        String removedCommas = secondWord.replace(",", "");

        return  removedCommas;
    }

    public static String resultTime(String str){

        String [] arrStr = str.split(" ");  // if you want to split by ( you need to write ("
        String secondWord = arrStr[3];
        String removedCommas = secondWord.replace("(", "");

        return  removedCommas;
    }
//another approach
    public static String resultT(String str){
        String [] words = str.split("\\(");  // if you want to split by ( you need to write ("
        String seconds = words[1];
        return seconds.replaceAll("\\)","");
    }







}
