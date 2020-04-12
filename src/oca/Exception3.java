package oca;

public class Exception3{

    public static void main( String[] args ) {
        try{
            int num = 10;
            int div = 0;
            int ans = num / div ;

        }catch (ArithmeticException ae){
      //    ans = 0;    // there is no local ans here
        }catch(Exception e){
            System.out.println ("invalid calculation");
        }
      //  System.out.println ("answer =" + ans); // there is no local ans here
    }
}
