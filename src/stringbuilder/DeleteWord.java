package stringbuilder;

public class DeleteWord{

    public static String deleteWord(String word){
       int index=0;
        StringBuilder sb = new StringBuilder(word);

       String str = sb.toString();
       if (str.contains("con")){
           index = str.indexOf("con");
           sb.delete(index, index+3);}
       else
           System.out.println("there is no con");

       return sb.toString();
    }
    public static String deleteWord(String word1, String word2){

        int index=0;
        StringBuilder sb = new StringBuilder(word1);

        String str = sb.toString();
        if (str.contains(word2)){
            index = str.indexOf(word2);
            sb.delete(index, index+word2.length());}
        else
            System.out.println("there is no con");

       //you can solve it -1 there is no word2 sb.indexOf(word2);

        return sb.toString();

    }

}
