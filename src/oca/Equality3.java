package oca;



public class Equality3{

    public static void main( String[] args ) {


        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();

        String str2 = str1; //true answer this line

//       String str2= sb1.toString();   // false
//        String str2 = new String(str1); //false
//        String str2 = "Duke"; //false
        System.out.println(str1==str2);
    }
}