package arrays;

public class ReverseTheWordinthesentence{

    public static void main( String[] args ) {


        String s = "We have a picnic today";
        String [] arr = s.trim().split(" ");


        String reversed="";

        for (int i=0; i<arr.length ; i++) {

           String word="";

           for (int j = arr[ i ].length() - 1;j >= 0;j--)
           {

               word += arr[i].charAt(j);
           }
           arr[i] = word;
           reversed += arr[ i ] + " ";
       }
        System.out.println("this is my reversed array :" + reversed);

    }

}


