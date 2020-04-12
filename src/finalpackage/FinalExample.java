package finalpackage;

public class FinalExample{

     //final String name; if you want to make final instance variable java complain here because of initial value
     final String name = " jason" ; //this way there is no compiling error
    static String name1 = "sevim";
    public static void main( String[] args ) {
        final int i;
        System.out.println("program");
        i = 25;
FinalExample f = new FinalExample();
        //f.name ="sevim";  // you can not change it like that because it is final
        System.out.println(i);
        // i=90; you can not assign the final variable here finals can not assigned anymore only one time you can initilize

//
//        System.out.println(name); // you can not use name without object or you need to hava non static method to use
        // non static instance variable


        System.out.println(name1); // if your variable is static print sevim



    }


}
