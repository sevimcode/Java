package oca;

public class Equality5{


    public static void main( String[] args ) {
        StringBuilder sb =new StringBuilder(5); // by default has hashcode
        String s = ""; // by default 0
       //  sb.append("sevim");  //you can add with append method not with assignment

        if (sb.equals(s)){    //matching values but one of them object one of them string
            System.out.println("match1");}
            else if (sb.toString().equals(s.toString())){ // matching values both of them empty
            System.out.println("match 2");
        }else {
            System.out.println("no match");
        }

        System.out.println(sb.toString()); //prints the value
        System.out.println(s.toString()); // prints the value

        StringBuilder b = new StringBuilder();
        b.append("sevim");
        b.delete(0, b.length());  // empty the contents of the variable b
        System.out.println(b);


        }  // prints match 2
    }

