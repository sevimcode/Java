package replit;

public class isAnagram{

    public static boolean isAnagram(String word1, String word2){


        if(word1.length() != word2.length()){
            return false; }

        char[] chars = word1.toCharArray();
        for(char c : chars){

            int index = word2.indexOf(c);

            if(index != -1){
                word2 = word2.substring(0,index) + word2.substring(index+1);
            }else{
                return false;
            } }
            return word2.isEmpty(); }





    public static void main(String[] args){

        System.out.println(isAnagram("listen", "slent"));


    }  }