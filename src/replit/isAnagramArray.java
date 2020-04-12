package replit;


import java.util.Arrays;

public class isAnagramArray{

    public static void main( String[] args ) {

        String[] array = { "listen" , "book" , "linest" , "adf" };
        String word = "silent";

        // public static String [] isAnagram(String word, String [] array) {

        String sorted = "";
        String word1="";
        int count = 0;
        String[] intermediate = new String[ array.length];


        char[] chars1= word.toCharArray();
        Arrays.sort(chars1);

        for (int k=0; k<chars1.length ; k++){
            word1 += chars1[k];

        }


       for (int i =0; i<array.length ; i++){
           sorted="";
               char[] chars2 = array[ i ].toCharArray();
               Arrays.sort(chars2);
               for (int k=0; k<chars2.length ; k++){
               sorted += chars2[k];

               }
               if (word1.equals(sorted)){
                   intermediate [count]=array[i];
                   count++;
               }

           }

        String [] result1= new String[count] ;

        for (int k=0; k<count ; k++){
            result1[k]= intermediate [k];}


        System.out.println(Arrays.toString(result1));

String s = 1234+"";
        System.out.println(s);
    }

}


