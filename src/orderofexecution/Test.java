//Order of execution?
//        First execute static block only once
//        Second execute non static block(without creating an object this block will not run,
//        even tough you don’t do anything with the object. Every time you create an object it will be executed)
//        Third execute constructor every time you create an object
//

package orderofexecution;

public class Test{

    String string ="";
    static int b =5;

    {
        b=3;
        System.out.println("This is NON STATIC BLOCK  " + b);
    }

    static
         {
             b= 55;
             System.out.println("This is static block  " + b);
         }


         public Test()
         {
              b = 60;
             System.out.println(" This is CONSTRUCTOR block  " + b);
         }

    public static void main( String[] args ) {

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

     //   b = 40;
        System.out.println(b);


    }

}
