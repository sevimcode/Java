package oca;

public class Vowel{

    private char var;  // var is a class variable for objects

    public static void main( String[] args ) {
        char var1 = 'a';
        char var2 = var1; // primitives shows its own value
        var2 = 'e';
        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;   // when you assign them each other one change the other one changes to pointing same object
        obj1.var ='o';
        obj2.var = 'i';
        System.out.println((var1 + ", " + var2));
        System.out.print(obj1.var + ", " + obj2.var);


    } // prints a , e   o , o

}
