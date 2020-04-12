package oca;

public class Exception1 extends Throwable{

    String myStr = "7007";
    public void doStuff (String str){
        int mynum=0;
     try{
         String myStr = str;   // local variable of try catch
         mynum = Integer.parseInt(myStr);

     }catch (NumberFormatException ne) {
         System.out.println("error");
     }
        System.out.println(" my str :" + myStr + ", my num:" + mynum); // instance myStr comes here outside of try block
    }
     //The myStr in try block becomes out-of-scope when it reaches the print line.

    public static void main( String[] args ) {
        Exception1 obj = new Exception1 ();
        obj.doStuff("9009");
    }
}

// prints  my str : 7007, my num:9009
